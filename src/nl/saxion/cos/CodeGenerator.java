package nl.saxion.cos;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;

import static nl.saxion.cos.Constants.*;

public class CodeGenerator extends SexyLangBaseVisitor<Void> {
    private final List<String> code;
    private final ParseTreeProperty<DataType> types;

    public CodeGenerator(ParseTreeProperty<DataType> types) {
        this.code = new ArrayList<>();
        this.types = types;
    }

    public List<String> getCode() {
        return this.code;
    }

    @Override
    public Void visitMoanStmt(SexyLangParser.MoanStmtContext ctx) {
        this.code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        visit(ctx.expression());

        DataType dataType = this.types.get(ctx.expression());
        this.code.add("invokevirtual java/io/PrintStream/print(" + dataType.getDescriptor() + ")V");

        return null;
    }

    @Override
    public Void visitAddSubExpression(SexyLangParser.AddSubExpressionContext ctx) {
        visit(ctx.left);
        visit(ctx.right);

        String typeMnemonic = this.types.get(ctx).getMnemonic();
        String instruction = getOperatorInstruction(ctx.op.getText());

        this.code.add(typeMnemonic + instruction);

        return null;
    }

    @Override
    public Void visitMulDivExpression(SexyLangParser.MulDivExpressionContext ctx) {
        visit(ctx.left);
        visit(ctx.right);

        String typeMnemonic = this.types.get(ctx).getMnemonic();
        String instruction = getOperatorInstruction(ctx.op.getText());

        this.code.add(typeMnemonic + instruction);

        return null;
    }

    @Override
    public Void visitBodyCountLiteral(SexyLangParser.BodyCountLiteralContext ctx) {
        int value = Integer.parseInt(ctx.getText());

        // TODO :
        if (value < 6) {
            this.code.add("iconst_" + value);
        } else {
            this.code.add("ldc " + value);
        }

        return null;
    }

    @Override
    public Void visitSafeWordLiteral(SexyLangParser.SafeWordLiteralContext ctx) {
        this.code.add("ldc " + ctx.getText());

        return null;
    }

    @Override
    public Void visitLengthLiteral(SexyLangParser.LengthLiteralContext ctx) {
        this.code.add("ldc " + ctx.getText());

        return null;
    }

    @Override
    public Void visitBulgeLiteral(SexyLangParser.BulgeLiteralContext ctx) {
        String value = ctx.getText();

        if (value.equals(TRUE_DESC)) {
            this.code.add("iconst_1");
        } else if (value.equals(FALSE_DESC)) {
            this.code.add("iconst_0");
        } else {
            assert false;
        }

        return null;
    }

    private String getOperatorInstruction(String operator) {
        switch (operator) {
            case ADD_SIGN: return "add";
            case SUB_SIGN: return "sub";
            case MUL_SIGN: return "mul";
            case DIV_SIGN: return "div";
            default: throw new RuntimeException("Unsupported arithmetic operator");
        }
    }
}
