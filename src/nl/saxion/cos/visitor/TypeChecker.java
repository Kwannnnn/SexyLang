package nl.saxion.cos.visitor;

import nl.saxion.cos.DataType;
import nl.saxion.cos.SexyLangBaseVisitor;
import nl.saxion.cos.SexyLangLexer;
import nl.saxion.cos.SexyLangParser;
import nl.saxion.cos.exception.CompilerException;
import nl.saxion.cos.type.Symbol;
import nl.saxion.cos.type.SymbolTable;
import nl.saxion.cos.type.VariableSymbol;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import static nl.saxion.cos.SexyLangUtils.*;

public class TypeChecker extends SexyLangBaseVisitor<DataType> {
    private final ParseTreeProperty<DataType> types;
    private final ParseTreeProperty<SymbolTable> scopes;
    private SymbolTable currentScope;

    // TODO:
    // TODO: Moan Statement
    // TODO: Lube Statement
    // TODO: Bed Activity Statement
    // TODO: Params

    public TypeChecker(ParseTreeProperty<DataType> types,
                       ParseTreeProperty<SymbolTable> scopes) {
        this.types = types;
        this.scopes = scopes;
        this.currentScope = new SymbolTable();
    }

    @Override
    public DataType visitBlockStatement(SexyLangParser.BlockStatementContext ctx) {
        this.currentScope = this.currentScope.openScope();
        visitChildren(ctx);
        this.currentScope = this.currentScope.closeScope();

        return null;
    }

    @Override
    public DataType visitLubeStmt(SexyLangParser.LubeStmtContext ctx) {
        DataType conditionType = visit(ctx.condition);

        if (conditionType != DataType.BULGE) {
            throw new CompilerException("Lube statement condition must be of type boolean");
        }

        visitChildren(ctx);

        return null;
    }

    @Override
    public DataType visitIfStmt(SexyLangParser.IfStmtContext ctx) {
        DataType conditionType = visit(ctx.condition);

        if (conditionType != DataType.BULGE) {
            throw new CompilerException("If statement condition must be of type boolean");
        }

        visitChildren(ctx);

        return null;
    }

    @Override
    public DataType visitElseIfStmt(SexyLangParser.ElseIfStmtContext ctx) {
        DataType conditionType = visit(ctx.condition);

        if (conditionType != DataType.BULGE) {
            throw new CompilerException("Condition must be of type boolean");
        }

        visitChildren(ctx);

        return null;
    }

    /**
     * Variable Assignment
     */
    @Override
    public DataType visitVarAssignment(SexyLangParser.VarAssignmentContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        VariableSymbol variableSymbol = (VariableSymbol) this.currentScope
                .lookup(variableName);

        // Checks if a variable with the same name exist in the scope
        if (variableSymbol == null) {
            throw new CompilerException("Variable '"+ variableName
                    + "' is not defined in current scope");
        }

        DataType varType = variableSymbol.getType();
        DataType exprType = visit(ctx.expression());

        // Check if type is specified during the declaration
        if (exprType != varType) {
            throw new CompilerException("Type of variable does not match" +
                    " the type of the given value!");
        }

        this.scopes.put(ctx, this.currentScope);
        return null;
    }

    /**
     * Variable Declaration
     */
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

        DataType varType = getDataType(varTypeIndex);
        // Check if the type of the expression that is saved in the variable is
        // the same as the declared type
        if (exprType != varType) {
            throw new CompilerException("Type of variable does not match" +
                    " the type of the given value!");
        }

        this.currentScope.addVariableSymbol(ctx.IDENTIFIER().getText(), varType);
        this.scopes.put(ctx, this.currentScope);
        return null;
    }

    /**
     * Group Expression
     */
    @Override
    public DataType visitGroupExpression(SexyLangParser.GroupExpressionContext ctx) {
        DataType type = visit(ctx.expression());
        this.types.put(ctx, type);
        return type;
    }

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

    /**
     * Mul - Div Expression
     */
    @Override
    public DataType visitMulDivExpression(SexyLangParser.MulDivExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);
        if (leftType != rightType
                || !COMPUTABLE_DATA_TYPES.contains(leftType)
                || !COMPUTABLE_DATA_TYPES.contains(rightType)) {
            throw new CompilerException(getIncompatibleOperandsMessage(
                    ctx.op.getText(),
                    leftType,
                    rightType
            ));
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

        // Handle string concatenation
        if (ctx.op.getType() == SexyLangLexer.ADD
                && (leftType == DataType.SAFE_WORD || rightType == DataType.SAFE_WORD)) {
            this.types.put(ctx, DataType.SAFE_WORD);
            return DataType.SAFE_WORD;
        }

        // Check whether operands are computable
        if (leftType != rightType
                || !COMPUTABLE_DATA_TYPES.contains(leftType)
                || !COMPUTABLE_DATA_TYPES.contains(rightType)) {
            throw new CompilerException(getIncompatibleOperandsMessage(
                    ctx.op.getText(),
                    leftType,
                    rightType
            ));
        }

        this.types.put(ctx, leftType);
        return leftType;
    }

    /**
     * Logic Expression
     */
    @Override
    public DataType visitLogicExpression(SexyLangParser.LogicExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);

        if (leftType != rightType
                || !isComparable(leftType)
                || !isComparable(rightType)) {
            throw new CompilerException(getIncompatibleOperandsMessage(
                    ctx.op.getText(),
                    leftType,
                    rightType
            ));
        }

        this.types.put(ctx, DataType.BULGE);
        return DataType.BULGE;
    }

    /**
     * Chained Logic Expression
     */
    @Override
    public DataType visitChainedLogicExpression(SexyLangParser.ChainedLogicExpressionContext ctx) {
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

    /**
     * Function Call Expression
     */
    @Override
    public DataType visitBedActivityCall(SexyLangParser.BedActivityCallContext ctx) {
        // TODO
        return null;
    }

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
     * Identifier Expression
     */
    @Override
    public DataType visitIdentifierExpression(SexyLangParser.IdentifierExpressionContext ctx) {
        Symbol symbol = this.currentScope.lookup(ctx.IDENTIFIER().getText());

        if (symbol == null) {
            throw new CompilerException("Variable with name " + ctx.IDENTIFIER().getText() + " does not exist.");
        }

        if (!(symbol instanceof VariableSymbol)) {
            throw new CompilerException("Identifier used as variable but is not a variable!");
        }

        DataType type = ((VariableSymbol) symbol).getType();
        this.types.put(ctx, type);
        this.scopes.put(ctx, this.currentScope);
        return type;
    }

    private boolean isComparable(DataType dataType) {
        return COMPARABLE_DATA_TYPES.contains(dataType);
    }
}
