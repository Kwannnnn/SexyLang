package nl.saxion.cos.visitor;

import nl.saxion.cos.*;
import nl.saxion.cos.type.ArraySymbol;
import nl.saxion.cos.type.Symbol;
import nl.saxion.cos.type.MethodSymbol;
import nl.saxion.cos.type.SymbolTable;
import nl.saxion.cos.type.VariableSymbol;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import static nl.saxion.cos.SexyLangUtils.getArrayElementType;
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
    public Void visitArrayValueChangeStmt(SexyLangParser.ArrayValueChangeStmtContext ctx) {
        SymbolTable symbolTable = this.scopes.get(ctx);
        ArraySymbol arraySymbol = (ArraySymbol) symbolTable.lookup(ctx.arrayAccess().IDENTIFIER().getText());
        DataType elementType = getArrayElementType(arraySymbol.getType());

        code.add("aload " + arraySymbol.getIndex());
        visit(ctx.arrayAccess().index);
        visit(ctx.expression());
        code.add(elementType.getMnemonic() + "astore");

        return null;
    }

    @Override
    public Void visitArrayAccessExpression(SexyLangParser.ArrayAccessExpressionContext ctx) {
        SymbolTable symbolTable = this.scopes.get(ctx);
        ArraySymbol arraySymbol = (ArraySymbol) symbolTable.lookup(ctx.arrayAccess().IDENTIFIER().getText());
        DataType elementType = getArrayElementType(arraySymbol.getType());

        code.add("aload " + arraySymbol.getIndex());
        visit(ctx.arrayAccess().index);
        code.add(elementType.getMnemonic() + "aload");

        return null;
    }

    // ugly ass solution
    @Override
    public Void visitBodyCountArrayLiteral(SexyLangParser.BodyCountArrayLiteralContext ctx) {
        int elementsCount = 0;

        if (ctx.bodyCountElements() != null) {
            elementsCount = ctx.bodyCountElements().bodyCountLiteral().size();
        }

        code.add("ldc " + elementsCount);
        code.add("newarray int");

        //populating the array
        int currentIndex = 0;
        for (ParseTree child : ctx.bodyCountElements().children) {
            if (child instanceof SexyLangParser.BodyCountLiteralContext) {
                code.add("dup");
                code.add("ldc " + currentIndex++);
                visit(child);
                code.add("iastore");
            }
        }

        return null;
    }

    @Override
    public Void visitLengthArrayLiteral(SexyLangParser.LengthArrayLiteralContext ctx) {
        int elementsCount = 0;

        if (ctx.lengthArrayElements() != null) {
            elementsCount = ctx.lengthArrayElements().lengthLiteral().size();
        }

        code.add("ldc " + elementsCount);
        code.add("newarray float");

        //populating the array
        int currentIndex = 0;
        for (ParseTree child : ctx.lengthArrayElements().children) {
            if (child instanceof SexyLangParser.LengthLiteralContext) {
                code.add("dup");
                code.add("ldc " + currentIndex++);
                visit(child);
                code.add("fastore");
            }
        }

        return null;
    }

    @Override
    public Void visitBulgeArrayLiteral(SexyLangParser.BulgeArrayLiteralContext ctx) {
        int elementsCount = 0;

        if (ctx.bulgeArrayElements() != null) {
            elementsCount = ctx.bulgeArrayElements().bulgeLiteral().size();
        }

        code.add("ldc " + elementsCount);
        code.add("newarray int");

        //populating the array
        int currentIndex = 0;
        for (ParseTree child : ctx.bulgeArrayElements().children) {
            if (child instanceof SexyLangParser.BulgeLiteralContext) {
                code.add("dup");
                code.add("ldc " + currentIndex++);
                visit(child);
                code.add("iastore");
            }
        }

        return null;
    }

    @Override
    public Void visitSafeWordArrayLiteral(SexyLangParser.SafeWordArrayLiteralContext ctx) {
        int elementsCount = 0;

        if (ctx.safeWordArrayElements() != null) {
            elementsCount = ctx.safeWordArrayElements().safeWordLiteral().size();
        }

        code.add("ldc " + elementsCount);
        code.add("anewarray java/lang/String");

        //populating the array
        int currentIndex = 0;
        for (ParseTree child : ctx.safeWordArrayElements().children) {
            if (child instanceof SexyLangParser.SafeWordLiteralContext) {
                code.add("dup");
                code.add("ldc " + currentIndex++);
                visit(child);
                code.add("aastore");
            }
        }

        return null;
    }

    // when providing a float use "," instead of "."
    @Override
    public Void visitWhatLengthCallExpression(SexyLangParser.WhatLengthCallExpressionContext ctx) {
        code.add("new java/util/Scanner");
        code.add("dup");
        code.add("getstatic java/lang/System/in Ljava/io/InputStream;");
        code.add("invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V");
        code.add("invokevirtual java/util/Scanner/nextFloat()F");

        return null;
    }

    @Override
    public Void visitBedActivityStmt(SexyLangParser.BedActivityStmtContext ctx) {
        return null;
    }

    @Override
    public Void visitBedActivityCall(SexyLangParser.BedActivityCallContext ctx) {
        if (ctx.params() != null) {
            ctx.params().expression().forEach(this::visit);
        }

        SymbolTable symbolTable = this.scopes.get(ctx);
        String methodName = ctx.name.getText();
        MethodSymbol methodSymbol = (MethodSymbol) symbolTable.lookup(methodName);
        this.code.add("invokestatic test/" + methodSymbol.getSignature());

        return null;
    }

    @Override
    public Void visitVarAssignment(SexyLangParser.VarAssignmentContext ctx) {
        SymbolTable symbolTable = this.scopes.get(ctx);
//        VariableSymbol variableSymbol = (VariableSymbol) symbolTable.lookup(ctx.IDENTIFIER().getText());
        Symbol symbol = symbolTable.lookup(ctx.IDENTIFIER().getText());
        visit(ctx.expression());
        if (symbol instanceof VariableSymbol) {
            this.code.add(((VariableSymbol) symbol).getType().getMnemonic() + "store " + ((VariableSymbol) symbol).getIndex());
        } else if (symbol instanceof ArraySymbol) {
            this.code.add(((ArraySymbol) symbol).getType().getMnemonic() + "store " + ((ArraySymbol) symbol).getIndex());
        }

        return null;
    }

    @Override
    public Void visitVarDeclaration(SexyLangParser.VarDeclarationContext ctx) {
        SymbolTable symbolTable = this.scopes.get(ctx);
        Symbol symbol = symbolTable.lookup(ctx.IDENTIFIER().getText());
        visit(ctx.expression());
        if (symbol instanceof VariableSymbol) {
            this.code.add(((VariableSymbol) symbol).getType().getMnemonic() + "store " + ((VariableSymbol) symbol).getIndex());
        } else if (symbol instanceof ArraySymbol) {
            this.code.add(((ArraySymbol) symbol).getType().getMnemonic() + "store " + ((ArraySymbol) symbol).getIndex());
        }

        return null;
    }

    @Override
    public Void visitIdentifierExpression(SexyLangParser.IdentifierExpressionContext ctx) {
        SymbolTable symbolTable = this.scopes.get(ctx);
        Symbol symbol = symbolTable.lookup(ctx.IDENTIFIER().getText());

        if (symbol instanceof VariableSymbol) {
            this.code.add(((VariableSymbol) symbol).getType().getMnemonic() + "load " + ((VariableSymbol) symbol).getIndex());
        } else if (symbol instanceof ArraySymbol) {
            this.code.add(((ArraySymbol) symbol).getType().getMnemonic() + "load " + ((ArraySymbol) symbol).getIndex());
        }

        return null;
    }

    @Override
    public Void visitLubeStmt(SexyLangParser.LubeStmtContext ctx) {
        long lubeCount = ++labelCounter;
        this.code.add("goto begin" + lubeCount);
        this.code.add("do" + ++labelCounter + ":");
        visit(ctx.block());
        this.code.add("begin" + lubeCount + ":");
        visit(ctx.condition);
        this.code.add("ifne do" + labelCounter);

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
    public Void visitNegationExpression(SexyLangParser.NegationExpressionContext ctx) {
        long negationLabel = ++labelCounter;
        visit(ctx.expression());
        this.code.add("ifeq jump" + ++labelCounter);
        this.code.add("iconst_0");
        this.code.add("goto endNeg" + negationLabel);
        this.code.add("jump" + labelCounter + ":");
        this.code.add("iconst_1");
        this.code.add("endNeg" + negationLabel + ":");

        return null;
    }

    @Override
    public Void visitLogicExpression(SexyLangParser.LogicExpressionContext ctx) {
        visit(ctx.left);
        visit(ctx.right);
        DataType dataType = this.types.get(ctx.left);

        String ifInstruction = "";
        if (dataType.equals(DataType.BODY_COUNT)) {
            switch (ctx.op.getType()) {
                case SexyLangLexer.GT:
                    ifInstruction += "if_icmple";
                    break;
                case SexyLangLexer.GE:
                    ifInstruction += "if_icmplt";
                    break;
                case SexyLangLexer.LT:
                    ifInstruction += "if_icmpge";
                    break;
                case SexyLangLexer.LE:
                    ifInstruction += "if_icmpgt";
                    break;
                case SexyLangLexer.EQUAL:
                    ifInstruction += "if_icmpne";
                    break;
            }
        } else if (dataType.equals(DataType.LENGTH)) {
            this.code.add("fcmpg");

            switch (ctx.op.getType()) {
                case SexyLangLexer.GT:
                    ifInstruction += "ifle";
                    break;
                case SexyLangLexer.GE:
                    ifInstruction += "iflt";
                    break;
                case SexyLangLexer.LT:
                    ifInstruction += "ifge";
                    break;
                case SexyLangLexer.LE:
                    ifInstruction += "ifgt";
                    break;
                case SexyLangLexer.EQUAL:
                    ifInstruction += "ifne";
                    break;
            }
        } else if (dataType.equals(DataType.BULGE)) {
            // only equals operator is allowed
            // otherwise an exception would have been thrown before this
            ifInstruction += "if_icmpne";
        }

        ifInstruction += " jump" + labelCounter;
        code.add(ifInstruction);

        code.add("iconst_1");
        code.add("goto endLogic" + labelCounter);

        code.add("jump" + labelCounter + ":");
        code.add("iconst_0");

        code.add("endLogic" + labelCounter + ":");

        labelCounter++;
        return null;
    }

    @Override
    public Void visitEjaculateStmt(SexyLangParser.EjaculateStmtContext ctx) {
        if (ctx.expression() == null) {
            this.code.add("return");
            return null;
        }

        visit(ctx.expression());
        this.code.add(this.types.get(ctx).getMnemonic() + "return");

        return null;
    }

    @Override
    public Void visitChainedLogicExpression(SexyLangParser.ChainedLogicExpressionContext ctx) {
        visit(ctx.left);
        visit(ctx.right);

        String ifInstuction = "";
        String defaultValue = "";
        String altValue = "";

        switch (ctx.op.getType()) {
            case SexyLangLexer.AND:
                ifInstuction = "ifeq";
                defaultValue = "iconst_1";
                altValue = "iconst_0";
                break;
            case SexyLangLexer.OR:
                ifInstuction = "ifne";
                defaultValue = "iconst_0";
                altValue = "iconst_1";
                break;
        }

        code.add(ifInstuction + " jumpFirst" + labelCounter);

        code.add(ifInstuction + " jumpSecond" + labelCounter);
        code.add(defaultValue);
        code.add("goto endChained" + labelCounter);

        code.add("jumpFirst" + labelCounter + ":");
        code.add("pop");

        code.add("jumpSecond" + labelCounter + ":");
        code.add(altValue);

        code.add("endChained" + labelCounter + ":");

        labelCounter++;
        return null;
    }

    @Override
    public Void visitAddSubExpression(SexyLangParser.AddSubExpressionContext ctx) {
        //TODO: use StringBuilder
        if (this.types.get(ctx) == DataType.SAFE_WORD) {
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
        this.code.add("ifeq jump" + labelCounter);
        visit(ctx.block());
        this.code.add("goto endif" + thisIfLabel);
        this.code.add("jump" + labelCounter + ":");

        if (ctx.elseIfStmt().size() > 0) {
            ctx.elseIfStmt().forEach(s -> {
                ++labelCounter;
                visit(s.condition);
                this.code.add("ifeq jump" + labelCounter);
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
        visit(ctx.condition);
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
