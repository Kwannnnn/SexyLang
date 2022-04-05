package nl.saxion.cos.visitor;

import nl.saxion.cos.DataType;
import nl.saxion.cos.JasminBytecode;
import nl.saxion.cos.SexyLangBaseVisitor;
import nl.saxion.cos.SexyLangParser;
import nl.saxion.cos.type.SymbolTable;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class MethodVisitor extends SexyLangBaseVisitor<Void> {
    private final ParseTreeProperty<DataType> types;
    private final ParseTreeProperty<SymbolTable> scopes;
    private final JasminBytecode code;

    public MethodVisitor(ParseTreeProperty<DataType> types,
                         ParseTreeProperty<SymbolTable> scopes,
                         JasminBytecode jasminBytecode) {
        this.types = types;
        this.scopes = scopes;
        this.code = jasminBytecode;
    }

    @Override
    public Void visitBedActivityStmt(SexyLangParser.BedActivityStmtContext ctx) {
        StringBuilder types = new StringBuilder();

        for (ParseTree arg : ctx.args().children) {
            if (arg.getText().equals(",")) {
                continue;
            }
            types.append(this.types.get(arg.getChild(0)).getDescriptor());
        }

        this.code.add(".method public static " + ctx.name.getText() + "(" + types + ")" + this.types.get(ctx.type()).getDescriptor());
        this.code.add(".limit stack 20");
        this.code.add(".limit locals 20");
        CodeGenerator codeGenerator = new CodeGenerator(this.types, this.scopes, this.code);
        codeGenerator.visit(ctx.methodBlock());
        this.code.add(".end method");

        return null;
    }
}
