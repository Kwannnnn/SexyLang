package nl.saxion.cos;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class TypeChecker extends SexyLangBaseVisitor<DataType> {
    private final ParseTreeProperty<DataType> types;

    public TypeChecker(ParseTreeProperty<DataType> types) {
        this.types = types;
    }

    @Override
    public DataType visitBodyCountLiteral(SexyLangParser.BodyCountLiteralContext ctx) {
        return DataType.BODY_COUNT;
    }

    @Override
    public DataType visitLengthLiteral(SexyLangParser.LengthLiteralContext ctx) {
        return DataType.LENGTH;
    }

    @Override
    public DataType visitBulgeLiteral(SexyLangParser.BulgeLiteralContext ctx) {
        return DataType.BULGE;
    }

    @Override
    public DataType visitSafeWordLiteral(SexyLangParser.SafeWordLiteralContext ctx) {
        return DataType.SAFE_WORD;
    }

    @Override
    public DataType visitAddSubExpression(SexyLangParser.AddSubExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);
        if (leftType != rightType) {
            throw new RuntimeException("Arithmetic operations on operands with different types is not allowed");
        }

        this.types.put(ctx, leftType);
        return leftType;
    }

    @Override
    public DataType visitMulDivExpression(SexyLangParser.MulDivExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);
        if (leftType != rightType) {
            throw new RuntimeException("Arithmetic operations on operands with different types is not allowed");
        }

        this.types.put(ctx, leftType);
        return leftType;
    }

    @Override
    public DataType visitMoanStmt(SexyLangParser.MoanStmtContext ctx) {
        DataType dataType = visit(ctx.expression());

        this.types.put(ctx, dataType);
        return dataType;
    }

    @Override
    public DataType visitNegationExpression(SexyLangParser.NegationExpressionContext ctx) {
        DataType dataType = visit(ctx.expression());

        if (!dataType.equals(DataType.BULGE)) {
            throw new RuntimeException("Negation operator not allowed on this type");
        }

        this.types.put(ctx, dataType);
        return dataType;
    }


}
