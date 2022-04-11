package nl.saxion.cos.visitor;

import nl.saxion.cos.SexyLangUtils;
import nl.saxion.cos.operator.ArithmeticOperator;
import nl.saxion.cos.operator.OperatorFactory;
import nl.saxion.cos.operator.RelationalOperator;
import nl.saxion.cos.type.DataType;
import nl.saxion.cos.SexyLangBaseVisitor;
import nl.saxion.cos.SexyLangParser;
import nl.saxion.cos.exception.CompilerException;
import nl.saxion.cos.symbol.ArraySymbol;
import nl.saxion.cos.symbol.MethodSymbol;
import nl.saxion.cos.symbol.Symbol;
import nl.saxion.cos.symbol.SymbolTable;
import nl.saxion.cos.symbol.VariableSymbol;
import nl.saxion.cos.type.DataTypeFactory;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class TypeChecker extends SexyLangBaseVisitor<DataType> {
    private final ParseTreeProperty<DataType> types;
    private final ParseTreeProperty<SymbolTable> scopes;
    private SymbolTable currentScope;

    public TypeChecker(ParseTreeProperty<DataType> types,
                       ParseTreeProperty<SymbolTable> scopes) {
        this.types = types;
        this.scopes = scopes;
        this.currentScope = new SymbolTable();
    }

    // region 1. Expressions

    // region 1.1. Group Expression

    /**
     * Group Expression
     */
    @Override
    public DataType visitGroupExpression(SexyLangParser.GroupExpressionContext ctx) {
        DataType type = visit(ctx.expression());
        this.types.put(ctx, type);
        return type;
    }

    // endregion Group Expression

    // region 1.2. Negation Expression

    /**
     * Negation Expression
     */
    @Override
    public DataType visitNegationExpression(SexyLangParser.NegationExpressionContext ctx) {
        DataType dataType = visit(ctx.expression());

        if (!dataType.equals(DataType.BULGE)) {
            throw new CompilerException("Negation operator cannot be applied" +
                    " on this type");
        }

        this.types.put(ctx, dataType);
        return dataType;
    }

    // endregion Negation Expression

    // region 1.3. Arithmetic Expressions

    /**
     * Mul - Div Expression
     */
    @Override
    public DataType visitMulDivExpression(SexyLangParser.MulDivExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);
        ArithmeticOperator op = getArithmeticOperator(ctx.op.getType());

        if (leftType != rightType
                || !isComputable(leftType)
                || !isComputable(rightType)) {
            throw new CompilerException(
                    SexyLangUtils.getIncompatibleOperandsMessage(
                        op.getToken(),
                        leftType,
                        rightType
                    )
            );
        }

        this.types.put(ctx, leftType);
        return leftType;
    }

    /**
     * Add - Sub Expression
     */
    @Override
    public DataType visitAddSubExpression(SexyLangParser.AddSubExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);
        ArithmeticOperator op = getArithmeticOperator(ctx.op.getType());

        // Handle string concatenation
        if (op == ArithmeticOperator.ADD
                && (leftType == DataType.SAFE_WORD || rightType == DataType.SAFE_WORD)) {
            this.types.put(ctx, DataType.SAFE_WORD);
            return DataType.SAFE_WORD;
        }

        // Check whether operands are computable
        if (leftType != rightType
                || !isComputable(leftType)
                || !isComputable(rightType)) {
            throw new CompilerException(
                    SexyLangUtils.getIncompatibleOperandsMessage(
                        op.getToken(),
                        leftType,
                        rightType
                    )
            );
        }

        this.types.put(ctx, leftType);
        return leftType;
    }

    // endregion Arithmetic Expressions

    // region 1.4. Relational Expression

    /**
     * Relational Expression
     */
    @Override
    public DataType visitRelationalExpression(SexyLangParser.RelationalExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);
        RelationalOperator op = getRelationalOperator(ctx.op.getType());

        if (leftType != rightType
                || (!isComparable(leftType) && op != RelationalOperator.EQUAL)
                || leftType.equals(DataType.SAFE_WORD)) {
            throw new CompilerException(
                    SexyLangUtils.getIncompatibleOperandsMessage(
                        op.getToken(),
                        leftType,
                        rightType
                    )
            );
        }

        this.types.put(ctx, DataType.BULGE);
        return DataType.BULGE;
    }

    // endregion Relational Expression

    // region 1.5. Boolean Algebra Expression

    /**
     * Boolean Algebra Expression
     */
    @Override
    public DataType visitBooleanAlgebraExpression(SexyLangParser.BooleanAlgebraExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);

        if (leftType != rightType) {
            throw new CompilerException("Logic operations on operands with different types is not allowed");
        } else if (!leftType.equals(DataType.BULGE)) {
            throw new CompilerException("Incomparable type for chained logic operations. Only bulge allowed.");
        }

        this.types.put(ctx, DataType.BULGE);
        return DataType.BULGE;
    }

    // endregion Boolean Algebra Expression

    // region 1.6. User Input Expression

    @Override
    public DataType visitWhatLengthCallExpression(SexyLangParser.WhatLengthCallExpressionContext ctx) {
        this.types.put(ctx, DataType.LENGTH);
        return DataType.LENGTH;
    }

    // endregion User Input Expression

    // region 1.7. Function Call Expression

    /**
     * Function Call Expression
     */
    @Override
    public DataType visitBedActivityCallExpression(SexyLangParser.BedActivityCallExpressionContext ctx) {
        String name = ctx.name.getText();
        MethodSymbol methodSymbol = (MethodSymbol) this.currentScope.lookup(name);

        if (methodSymbol == null) {
            throw new CompilerException("Cannot resolve bed activity '" + name + "'.");
        }

        if (ctx.params() != null) {
            if (methodSymbol.getArgs().size() != ctx.params().expression().size()) {
                throw new CompilerException("Cannot resolve bed activity '" + name + "'");
            }

            AtomicInteger index = new AtomicInteger();
            ctx.params().expression().forEach(e -> {
                if (visit(e) != methodSymbol.getDataTypeAtIndex(index.getAndIncrement())) {
                    throw new CompilerException("Illegal argument type");
                }
            });
        }

        this.scopes.put(ctx, this.currentScope);
        this.types.put(ctx, methodSymbol.getReturnType());
        return methodSymbol.getReturnType();
    }

    // endregion Function Call Expression

    // region 1.8. Literals

    /**
     * Boolean Literal Expression
     */
    @Override
    public DataType visitBulgeLiteralExpression(SexyLangParser.BulgeLiteralExpressionContext ctx) {
        this.types.put(ctx, DataType.BULGE);
        return DataType.BULGE;
    }

    /**
     * Integer Literal Expression
     */
    @Override
    public DataType visitBodyCountLiteralExpression(SexyLangParser.BodyCountLiteralExpressionContext ctx) {
        this.types.put(ctx, DataType.BODY_COUNT);
        return DataType.BODY_COUNT;
    }

    /**
     * String Literal Expression
     */
    @Override
    public DataType visitSafeWordLiteralExpression(SexyLangParser.SafeWordLiteralExpressionContext ctx) {
        this.types.put(ctx, DataType.SAFE_WORD);
        return DataType.SAFE_WORD;
    }

    /**
     * Float Literal Expression
     */
    @Override
    public DataType visitLengthLiteralExpression(SexyLangParser.LengthLiteralExpressionContext ctx) {
        this.types.put(ctx, DataType.LENGTH);
        return DataType.LENGTH;
    }

    /**
     * Integer Array Literal Expression
     */
    @Override
    public DataType visitBodyCountArrayLiteralExpression(SexyLangParser.BodyCountArrayLiteralExpressionContext ctx) {
        this.types.put(ctx, DataType.BODY_COUNT_ARRAY);
        return DataType.BODY_COUNT_ARRAY;
    }

    /**
     * Float Array Literal Expression
     */
    @Override
    public DataType visitLengthArrayLiteralExpression(SexyLangParser.LengthArrayLiteralExpressionContext ctx) {
        this.types.put(ctx, DataType.LENGTH_ARRAY);
        return DataType.LENGTH_ARRAY;
    }

    /**
     * Boolean Array Literal Expression
     */
    @Override
    public DataType visitBulgeArrayLiteralExpression(SexyLangParser.BulgeArrayLiteralExpressionContext ctx) {
        this.types.put(ctx, DataType.BULGE_ARRAY);
        return DataType.BULGE_ARRAY;
    }

    /**
     * String Array Literal Expression
     */
    @Override
    public DataType visitSafeWordArrayLiteralExpression(SexyLangParser.SafeWordArrayLiteralExpressionContext ctx) {
        this.types.put(ctx, DataType.SAFE_WORD_ARRAY);
        return DataType.SAFE_WORD_ARRAY;
    }

    // endregion Literals

    // region 1.9. Array Access Expression

    @Override
    public DataType visitArrayAccessExpression(SexyLangParser.ArrayAccessExpressionContext ctx) {
        DataType type = visit(ctx.arrayAccess());
        this.types.put(ctx, type);
        this.scopes.put(ctx, this.currentScope);
        return type;
    }

    @Override
    public DataType visitArrayAccess(SexyLangParser.ArrayAccessContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        Symbol arraySymbol = this.currentScope
                .lookup(variableName);
        DataType indexType = visit(ctx.index);

        // Checks if a variable with the same name exist in the scope
        if (arraySymbol == null) {
            throw new CompilerException("Array '"+ variableName
                    + "' is not defined in current scope");
        }

        if (!(arraySymbol instanceof ArraySymbol)) {
            throw new CompilerException("Variable '" + variableName
                    + "' is not of type array");
        }

        if (!indexType.equals(DataType.BODY_COUNT)) {
            throw new CompilerException("Index must be of type bodyCount");
        }

        return SexyLangUtils.getArrayElementType(((ArraySymbol) arraySymbol).getType());
    }

    // endregion Array Access Expression

    // region 1.10. Identifier

    /**
     * Identifier Expression
     */
    @Override
    public DataType visitIdentifierExpression(SexyLangParser.IdentifierExpressionContext ctx) {
        Symbol symbol = this.currentScope.lookup(ctx.IDENTIFIER().getText());

        if (symbol == null) {
            throw new CompilerException("Variable with name " + ctx.IDENTIFIER().getText() + " does not exist.");
        }

        if (symbol instanceof ArraySymbol == symbol instanceof VariableSymbol) {
            throw new CompilerException("Identifier used as variable but is not a variable!");
        }

        DataType type = symbol instanceof VariableSymbol ?
                ((VariableSymbol) symbol).getType()
                : ((ArraySymbol) symbol).getType();

        this.types.put(ctx, type);
        this.scopes.put(ctx, this.currentScope);
        return type;
    }

    // endregion Identifier

    // endregion Expressions
    // region 2. Statements

    // region 2.1. Block Statement

    @Override
    public DataType visitBlockStatement(SexyLangParser.BlockStatementContext ctx) {
        visitChildren(ctx);

        return null;
    }

    // endregion Block Statement

    // region 2.2. Array Value Change Statement

    @Override
    public DataType visitArrayValueChangeStmt(SexyLangParser.ArrayValueChangeStmtContext ctx) {
        DataType exprType = visit(ctx.expression());
        DataType varType = visit(ctx.arrayAccess());

        if (exprType != varType) {
            throw new CompilerException("Type of variable does not match" +
                    " the type of the given value!");
        }

        this.types.put(ctx, varType);
        this.scopes.put(ctx, this.currentScope);
        return null;
    }

    // end Array Value Change Statement

    // endregion Statements

    // region 2.3. Variable Declaration

    @Override
    public DataType visitVarDeclaration(SexyLangParser.VarDeclarationContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        Symbol variableSymbol = this.currentScope.lookup(variableName);

        // Checks if a variable with the same name exist in the scope
        if (variableSymbol != null) {
            throw new CompilerException("Variable '"+ variableName
                    + "' is already defined in the scope");
        }

        DataType exprType = visit(ctx.expression());
        int varTypeIndex = ctx.varType.start.getType();

        DataTypeFactory dataTypeFactory = new DataTypeFactory();
        DataType varType = dataTypeFactory.createDataType(varTypeIndex);
        // Check if the type of the expression that is saved in the variable is
        // the same as the declared type
        if (exprType != varType) {
            throw new CompilerException("Type of variable does not match" +
                    " the type of the given value!");
        }

        if (exprType.equals(DataType.BODY_COUNT)
                | exprType.equals(DataType.LENGTH)
                | exprType.equals(DataType.BULGE)
                | exprType.equals(DataType.SAFE_WORD)) {
            this.currentScope.addVariableSymbol(variableName, varType);

        } else {
            this.currentScope.addArraySymbol(variableName, varType);
        }
        this.scopes.put(ctx, this.currentScope);
        return null;
    }

    // endregion Variable Declaration

    // region 2.4. Variable Assignment

    @Override
    public DataType visitVarAssignment(SexyLangParser.VarAssignmentContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Symbol symbol = this.currentScope
                .lookup(name);

        // Checks if a variable with the same name exist in the scope
        if (symbol == null) {
            throw new CompilerException("Variable '"+ name
                    + "' is not defined in current scope");
        }

        DataType varType = symbol instanceof VariableSymbol ?
                ((VariableSymbol) symbol).getType()
                : ((ArraySymbol) symbol).getType();

        DataType exprType = visit(ctx.expression());

        // Check if type is specified during the declaration
        if (exprType != varType) {
            throw new CompilerException("Type of variable does not match" +
                    " the type of the given value!");
        }

        if (isPrimitive(varType)) {
            this.currentScope.addVariableSymbol(name, varType);
        } else if(isArray(varType)) {
            this.currentScope.addArraySymbol(name, varType);
        } else {
            assert false;
        }

        this.types.put(ctx, varType);
        this.scopes.put(ctx, this.currentScope);
        return null;
    }

    // endregion Variable Assignment

    // region 2.5. If Statement

    @Override
    public DataType visitIfStmt(SexyLangParser.IfStmtContext ctx) {
        DataType conditionType = visit(ctx.condition);

        if (conditionType != DataType.BULGE) {
            throw new CompilerException("If statement condition must be of type boolean");
        }

        this.currentScope = this.currentScope.openScope();
        visitChildren(ctx);
        this.currentScope = this.currentScope.closeScope();

        return null;
    }

    @Override
    public DataType visitElseIfStmt(SexyLangParser.ElseIfStmtContext ctx) {
        DataType conditionType = visit(ctx.condition);

        if (conditionType != DataType.BULGE) {
            throw new CompilerException("Condition must be of type boolean");
        }

        this.currentScope = this.currentScope.openScope();
        visit(ctx.block());
        this.currentScope = this.currentScope.closeScope();

        return null;
    }

    // endregion If Statement

    // region 2.6. Loop Statement

    @Override
    public DataType visitLubeStmt(SexyLangParser.LubeStmtContext ctx) {
        DataType conditionType = visit(ctx.condition);

        if (conditionType != DataType.BULGE) {
            throw new CompilerException("Lube statement condition must be of type boolean");
        }

        this.currentScope = this.currentScope.openScope();
        visit(ctx.block());
        this.currentScope = this.currentScope.closeScope();

        return null;
    }

    // endregion Loop Statement

    // region 2.7. Function Declaration Statement

    @Override
    public DataType visitBedActivityStmt(SexyLangParser.BedActivityStmtContext ctx) {
        DataType returnType = visit(ctx.type());
        List<DataType> argTypes = new ArrayList<>();

        this.currentScope = this.currentScope.openScope();
        // Check if there are any args and visit them
        if(ctx.parameterList() != null) {
            ctx.parameterList().parameterDeclaration().forEach(arg -> {
                argTypes.add(visit(arg));
            });
        }

        DataType ejaculateType = visit(ctx.methodBlock().ejaculateStmt());

        if (ejaculateType != returnType ) {
            throw new CompilerException("Return type does not match function type");
        }

        // Visit the parameters and the body in the new scope
        visit(ctx.methodBlock());
        this.currentScope = this.currentScope.closeScope();

        // Store the function name in current scope
        this.currentScope.addMethodSymbol(
                ctx.IDENTIFIER().getText(),
                argTypes,
                returnType
        );
        this.scopes.put(ctx, this.currentScope);

        return null;
    }

    // endregion Function Declaration Statement

    // region 2.8. Return Statement

    @Override
    public DataType visitEjaculateStmt(SexyLangParser.EjaculateStmtContext ctx) {
        DataType returnType = ctx.expression() != null
                ? visit(ctx.expression())
                : DataType.EMPTY;

        this.types.put(ctx, returnType);
        return returnType;
    }

    // endregion Return Statement

    // endregion Statements

    @Override
    public DataType visitMethodBlock(SexyLangParser.MethodBlockContext ctx) {
        visitChildren(ctx);

        return null;
    }

    @Override
    public DataType visitParameterDeclaration(SexyLangParser.ParameterDeclarationContext ctx) {
        String name = ctx.name.getText();
        Symbol symbol = this.currentScope.lookup(name);

        if (symbol != null) {
            throw  new CompilerException("Variable '" + name + "' is already" +
                    " defined in the scope.");
        }

        DataType type = visit(ctx.type());

        if (isPrimitive(type)) {
            this.currentScope.addVariableSymbol(name, type);
        } else if(isArray(type)) {
            this.currentScope.addArraySymbol(name, type);
        } else {
            assert false;
        }

        this.scopes.put(ctx, this.currentScope);

        return type;
    }

    @Override
    public DataType visitType(SexyLangParser.TypeContext ctx) {
        int tokenIndex = ctx.getStart().getType();
        DataTypeFactory dataTypeFactory = new DataTypeFactory();
        DataType dataType = dataTypeFactory.createDataType(tokenIndex);

        this.types.put(ctx, dataType);
        return dataType;
    }

    private boolean isComputable(DataType dataType) {
        return SexyLangUtils.COMPUTABLE_DATA_TYPES.contains(dataType);
    }

    private boolean isComparable(DataType dataType) {
        return SexyLangUtils.COMPARABLE_DATA_TYPES.contains(dataType);
    }

    private boolean isPrimitive(DataType dataType) {
        return SexyLangUtils.PRIMITIVE_DATA_TYPES.contains(dataType);
    }

    private boolean isArray(DataType dataType) {
        return SexyLangUtils.ARRAY_DATA_TYPES.contains(dataType);
    }

    private ArithmeticOperator getArithmeticOperator(int opTokenIndex) {
        OperatorFactory operatorFactory = new OperatorFactory();
        return operatorFactory.createArithmeticOperator(opTokenIndex);
    }

    private RelationalOperator getRelationalOperator(int opTokenIndex) {
        OperatorFactory operatorFactory = new OperatorFactory();
        return operatorFactory.createRelationalOperator(opTokenIndex);
    }
}
