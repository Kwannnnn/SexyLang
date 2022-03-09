package nl.saxion.cos;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;

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
        // TODO: this only works with strings. The typechecker will help with making it work
        this.code.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");

        return null;
    }

    @Override
    public Void visitAddSubExpression(SexyLangParser.AddSubExpressionContext ctx) {
        visit(ctx.left);
        visit(ctx.right);

        DataType dataType = types.get(ctx);
        if (dataType == DataType.BODY_COUNT) {
            this.code.add("iadd");
        } else if (dataType == DataType.LENGTH) {
            this.code.add("fadd");
        } else {
            assert false;
        }

        return null;
    }

    @Override
    public Void visitLiteral(SexyLangParser.LiteralContext ctx) {
        this.code.add("ldc " + ctx.getText());

        return null;
    }
}
