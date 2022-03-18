package nl.saxion.cos;

import nl.saxion.cos.type.SymbolTable;
import nl.saxion.cos.type.VariableSymbol;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;

import static nl.saxion.cos.SexyLangUtils.getOperatorInstruction;

public class CodeGenerator extends SexyLangBaseVisitor<Void> {
    private final List<String> code;
    private final ParseTreeProperty<DataType> types;
    private final SymbolTable symbolTable;

    public CodeGenerator(ParseTreeProperty<DataType> types, SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.code = new ArrayList<>();
        this.types = types;
    }

    public List<String> getCode() {
        return this.code;
    }

    @Override
    public Void visitVarDeclaration(SexyLangParser.VarDeclarationContext ctx) {
        VariableSymbol variableSymbol = (VariableSymbol) this.symbolTable.lookup(ctx.IDENTIFIER().getText());
        visit(ctx.expression()); // Put something on the stack
        this.code.add(variableSymbol.getType().getMnemonic() + "store " + variableSymbol.getIndex());

        return null;
    }

    @Override
    public Void visitIdentifierExpression(SexyLangParser.IdentifierExpressionContext ctx) {
        VariableSymbol variableSymbol = (VariableSymbol) this.symbolTable.lookup(ctx.IDENTIFIER().getText());
        this.code.add(variableSymbol.getType().getMnemonic() + "load " + variableSymbol.getIndex());
        
        return null;
    }

    @Override
    public Void visitMoanStmt(SexyLangParser.MoanStmtContext ctx) {
        this.code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        visit(ctx.expression());
        DataType dataType = this.types.get(ctx.expression());

        switch (ctx.command.getType()) {
            case SexyLangLexer.MOAN:
                this.code.add("invokevirtual java/io/PrintStream/print(" + dataType.getDescriptor() + ")V");
                break;
            case SexyLangLexer.MOANLOUD:
                this.code.add("invokevirtual java/io/PrintStream/println(" + dataType.getDescriptor() + ")V");
                break;
            default:
                assert false;
                break;
        }

        return null;
    }

    @Override
    public Void visitAddSubExpression(SexyLangParser.AddSubExpressionContext ctx) {
        visit(ctx.left);
        visit(ctx.right);

        String typeMnemonic = this.types.get(ctx).getMnemonic();
        String instruction = getOperatorInstruction(ctx.op.getType());

        this.code.add(typeMnemonic + instruction);

        return null;
    }

    @Override
    public Void visitMulDivExpression(SexyLangParser.MulDivExpressionContext ctx) {
        visit(ctx.left);
        visit(ctx.right);

        String typeMnemonic = this.types.get(ctx).getMnemonic();
        String instruction = getOperatorInstruction(ctx.op.getType());

        this.code.add(typeMnemonic + instruction);

        return null;
    }

    @Override
    public Void visitBodyCountLiteral(SexyLangParser.BodyCountLiteralContext ctx) {
        int value = Integer.parseInt(ctx.getText());

        this.code.add(value >= 0 && value <= 5 ? "iconst_" + value : "ldc " + value);

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
    public Void visitIfStmt(SexyLangParser.IfStmtContext ctx) {
        visit(ctx.condition);
        this.code.add("ifeq end");
        visit(ctx.block());
        this.code.add("end:");

        return null;
    }

    @Override
    public Void visitBulgeLiteral(SexyLangParser.BulgeLiteralContext ctx) {
        this.code.add(ctx.HARD() != null ? "iconst_1" : "iconst_0");

        return null;
    }
}
