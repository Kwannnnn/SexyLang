package nl.saxion.cos.visitor;

import nl.saxion.cos.*;
import nl.saxion.cos.type.SymbolTable;
import nl.saxion.cos.type.VariableSymbol;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import static nl.saxion.cos.SexyLangUtils.getOperatorInstruction;

public class CodeGenerator extends SexyLangBaseVisitor<Void> {
    private long labelCounter;
    private final JasminBytecode code;
    private final ParseTreeProperty<DataType> types;
    private final ParseTreeProperty<SymbolTable> scopes;

    public CodeGenerator(ParseTreeProperty<DataType> types,
                         ParseTreeProperty<SymbolTable> scopes,
                         JasminBytecode jasminBytecode) {
        this.types = types;
        this.scopes = scopes;
        this.code = jasminBytecode;
    }

    @Override
    public Void visitVarAssignment(SexyLangParser.VarAssignmentContext ctx) {
        SymbolTable symbolTable = this.scopes.get(ctx);
        VariableSymbol variableSymbol = (VariableSymbol) symbolTable.lookup(ctx.IDENTIFIER().getText());
        visit(ctx.expression());
        this.code.add(variableSymbol.getType().getMnemonic() + "store " + variableSymbol.getIndex());

        return null;
    }

    @Override
    public Void visitVarDeclaration(SexyLangParser.VarDeclarationContext ctx) {
        SymbolTable symbolTable = this.scopes.get(ctx);
        VariableSymbol variableSymbol = (VariableSymbol) symbolTable.lookup(ctx.IDENTIFIER().getText());
        visit(ctx.expression()); // Put something on the stack
        this.code.add(variableSymbol.getType().getMnemonic() + "store " + variableSymbol.getIndex());

        return null;
    }

    @Override
    public Void visitIdentifierExpression(SexyLangParser.IdentifierExpressionContext ctx) {
        SymbolTable symbolTable = this.scopes.get(ctx);
        VariableSymbol variableSymbol = (VariableSymbol) symbolTable.lookup(ctx.IDENTIFIER().getText());
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
    public Void visitLogicExpression(SexyLangParser.LogicExpressionContext ctx) {
        visit(ctx.left);
        visit(ctx.right);
        DataType dataType = this.types.get(ctx.left);
        switch (ctx.op.getType()) {
            case SexyLangLexer.GT:
                this.code.add("if_" + dataType.getMnemonic() + "cmple jump" + labelCounter);
                break;
            case SexyLangLexer.GE:
                this.code.add("if_" + dataType.getMnemonic() + "cmplt jump" + labelCounter);
                break;
            case SexyLangLexer.LT:
                this.code.add("if_" + dataType.getMnemonic() + "cmpge jump" + labelCounter);
                break;
            case SexyLangLexer.LE:
                this.code.add("if_" + dataType.getMnemonic() + "cmpgt jump" + labelCounter);
                break;
        }

        return null;
    }

    @Override
    public Void visitChainedLogicExpression(SexyLangParser.ChainedLogicExpressionContext ctx) {
        visit(ctx.left);
        visit(ctx.right);

        return null;
    }

    @Override
    public Void visitAddSubExpression(SexyLangParser.AddSubExpressionContext ctx) {
        if (this.types.get(ctx) == DataType.SAFE_WORD) {
            // TODO: Ask Gerralt about getText() returning string containing " or '
            this.code.add("ldc \"" + ctx.left.getText().replace("\"", "")
                    + ctx.right.getText().replace("\"", "") + "\"");
            return null;
        }

        generateTwoOperandCode(
                ctx.left,
                ctx.right,
                this.types.get(ctx).getMnemonic(),
                getOperatorInstruction(ctx.op.getType())
        );

        return null;
    }

    @Override
    public Void visitMulDivExpression(SexyLangParser.MulDivExpressionContext ctx) {
        generateTwoOperandCode(
                ctx.left,
                ctx.right,
                this.types.get(ctx).getMnemonic(),
                getOperatorInstruction(ctx.op.getType())
        );

        return null;
    }

    @Override
    public Void visitBodyCountLiteral(SexyLangParser.BodyCountLiteralContext ctx) {
        int value = Integer.parseInt(ctx.getText());

        if (value >= 0 && value <= 5) {
            this.code.add("iconst_" + value);
        } else if (value >= -128 && value <= 127) {
            this.code.add("bipush " + value);
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
    public Void visitIfStmt(SexyLangParser.IfStmtContext ctx) {
        long thisIfLabel = ++labelCounter;
        visit(ctx.condition);
        visit(ctx.block());
        this.code.add("goto endif" + thisIfLabel);
        this.code.add("jump" + labelCounter + ":");

        if (ctx.elseIfStmt().size() > 0) {
            ctx.elseIfStmt().forEach(s -> {
                ++labelCounter;
                visit(s.conition);
                visit(s.block());
                this.code.add("goto endif" + thisIfLabel);
                this.code.add("jump" + labelCounter + ":");
            });
        }

        if (ctx.elseStmt() != null) {
            visit(ctx.elseStmt());
        }

        this.code.add("endif" + thisIfLabel + ":");

        return null;
    }

    @Override
    public Void visitElseIfStmt(SexyLangParser.ElseIfStmtContext ctx) {
        visit(ctx.conition);
        visit(ctx.block());
        this.code.add("jump" + labelCounter + ":");

        return null;
    }

    @Override
    public Void visitBulgeLiteral(SexyLangParser.BulgeLiteralContext ctx) {
        this.code.add(ctx.HARD() != null ? "iconst_1" : "iconst_0");

        return null;
    }

    private void generateTwoOperandCode(SexyLangParser.ExpressionContext left,
                                        SexyLangParser.ExpressionContext right,
                                        String typeMnemonic,
                                        String instruction) {
        visit(left);
        visit(right);

        this.code.add(typeMnemonic + instruction);
    }
}
