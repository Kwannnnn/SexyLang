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
            throw new RuntimeException("Adding different types is not allowed");
        }

        this.types.put(ctx, leftType);
        return leftType;
    }
}
