package nl.saxion.cos;

import nl.saxion.cos.exception.CompilerException;
import nl.saxion.cos.type.Symbol;
import nl.saxion.cos.type.SymbolTable;
import nl.saxion.cos.type.VariableSymbol;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import static nl.saxion.cos.SexyLangUtils.getDataType;

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

    @Override
    public DataType visitBlockStatement(SexyLangParser.BlockStatementContext ctx) {
        this.currentScope = this.currentScope.openScope();
        visitChildren(ctx);
        this.currentScope = this.currentScope.closeScope();

        return null;
    }

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

        // Check if type is specified during the declaration
        if (varTypeIndex == Token.INVALID_TYPE) {
            throw new CompilerException("No variable type specified for '"
                    + variableName + "'");
        }

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

    @Override
    public DataType visitAddSubExpression(SexyLangParser.AddSubExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);
        if (leftType != rightType) {
            throw new CompilerException("Operator '" + ctx.op + "' cannot be" +
                    "applied on operands with different types");
        }

        this.types.put(ctx, leftType);
        return leftType;
    }

    @Override
    public DataType visitMulDivExpression(SexyLangParser.MulDivExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);
        if (leftType != rightType) {
            throw new CompilerException("Operator '" + ctx.op + "' cannot be" +
                    "applied on operands with different types");
        }

        this.types.put(ctx, leftType);
        return leftType;
    }

    @Override
    public DataType visitLogicExpression(SexyLangParser.LogicExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);

        if (leftType != rightType) {
            throw new CompilerException("Operator '" + ctx.op + "' cannot be" +
                    "applied on operands with different types");
        }

        if (!SexyLangUtils.COMPARABLE_DATA_TYPES.contains(leftType)) {
            throw new CompilerException("Incomparable type for logic" +
                    "operations. Only bodyCount or length allowed.");
        }

        this.types.put(ctx, DataType.BULGE);
        return DataType.BULGE;
    }

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

    @Override
    public DataType visitIfStmt(SexyLangParser.IfStmtContext ctx) {
        DataType conditionType = visit(ctx.condition);

        if (conditionType != DataType.BULGE) {
            throw new CompilerException("If statement condition must be of type boolean");
        }

        visit(ctx.block());

        return null;
    }

    @Override
    public DataType visitGroupExpression(SexyLangParser.GroupExpressionContext ctx) {
        DataType type = visit(ctx.expression());
        this.types.put(ctx, type);
        return type;
    }

    @Override
    public DataType visitBedActivityCall(SexyLangParser.BedActivityCallContext ctx) {
        // TODO
        return null;
    }

    // TODO: Ask Gerralt about visiting visitBodyCountLiteralExpression vs visitBodyCountLiteral

    @Override
    public DataType visitBodyCountLiteralExpression(SexyLangParser.BodyCountLiteralExpressionContext ctx) {
        this.types.put(ctx, DataType.BODY_COUNT);
        return DataType.BODY_COUNT;
    }

    @Override
    public DataType visitLengthLiteralExpression(SexyLangParser.LengthLiteralExpressionContext ctx) {
        this.types.put(ctx, DataType.LENGTH);
        return DataType.LENGTH;
    }

    @Override
    public DataType visitBulgeLiteralExpression(SexyLangParser.BulgeLiteralExpressionContext ctx) {
        this.types.put(ctx, DataType.BULGE);
        return DataType.BULGE;
    }

    @Override
    public DataType visitSafeWordLiteralExpression(SexyLangParser.SafeWordLiteralExpressionContext ctx) {
        this.types.put(ctx, DataType.SAFE_WORD);
        return DataType.SAFE_WORD;
    }

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
}
