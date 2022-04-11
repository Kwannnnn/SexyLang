package nl.saxion.cos.visitor;

import nl.saxion.cos.*;
import nl.saxion.cos.operator.ArithmeticOperator;
import nl.saxion.cos.operator.LogicalOperator;
import nl.saxion.cos.operator.OperatorFactory;
import nl.saxion.cos.operator.RelationalOperator;
import nl.saxion.cos.symbol.ArraySymbol;
import nl.saxion.cos.symbol.Symbol;
import nl.saxion.cos.symbol.MethodSymbol;
import nl.saxion.cos.symbol.SymbolTable;
import nl.saxion.cos.symbol.VariableSymbol;
import nl.saxion.cos.type.DataType;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import static nl.saxion.cos.SexyLangUtils.getArrayElementType;

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
    public Void visitBedActivityCallExpression(SexyLangParser.BedActivityCallExpressionContext ctx) {
        if (ctx.params() != null) {
            ctx.params().expression().forEach(this::visit);
        }

        SymbolTable symbolTable = this.scopes.get(ctx);
        String methodName = ctx.name.getText();
        MethodSymbol methodSymbol = (MethodSymbol) symbolTable.lookup(methodName);
        this.code.add("invokestatic " + code.getClassName() + "/" + methodSymbol.getSignature());

        return null;
    }

    @Override
    public Void visitVarAssignment(SexyLangParser.VarAssignmentContext ctx) {
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
        long lubeCount = labelCounter++;
        this.code.add("goto begin" + lubeCount);
        this.code.add("do" + lubeCount + ":");
        visit(ctx.block());
        this.code.add("begin" + lubeCount + ":");
        visit(ctx.condition);
        this.code.add("ifne do" + lubeCount);

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
        long negationLabel = labelCounter++;
        visit(ctx.expression());
        OperatorFactory operatorFactory = new OperatorFactory();
        LogicalOperator op = operatorFactory.createLogicalOperator(ctx.op.getType());
        String instruction = op.getInstruction();

        String jumpLabel = "jump" + negationLabel;
        String endOperationLabel = "end" + negationLabel;
        this.code.add(instruction + " " + jumpLabel);
        this.code.add(op.getDefaultValue());
        this.code.add("goto " + endOperationLabel);
        this.code.add(jumpLabel + ":");
        this.code.add(op.getAltValue());
        this.code.add(endOperationLabel + ":");

        return null;
    }

    @Override
    public Void visitRelationalExpression(SexyLangParser.RelationalExpressionContext ctx) {
        visit(ctx.left);
        visit(ctx.right);
        DataType operandType = this.types.get(ctx.left);

        OperatorFactory operatorFactory = new OperatorFactory();
        RelationalOperator operator = operatorFactory.createRelationalOperator(ctx.op.getType());

        this.code.add(getIfInstruction(operandType, operator));
        this.code.add("iconst_1");
        this.code.add("goto endLogic" + labelCounter);
        this.code.add("jump" + labelCounter + ":");
        this.code.add("iconst_0");
        this.code.add("endLogic" + labelCounter + ":");

        this.labelCounter++;
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
    public Void visitBooleanAlgebraExpression(SexyLangParser.BooleanAlgebraExpressionContext ctx) {
        visit(ctx.left);
        visit(ctx.right);
        OperatorFactory operatorFactory = new OperatorFactory();
        LogicalOperator operator = operatorFactory.createLogicalOperator(ctx.op.getType());

        String instruction = operator.getInstruction();
        String leftFalseLabel = "jumpFirst" + labelCounter;
        String rightFalseLabel = "jumpSecond" + labelCounter;
        String endOperationLabel = "end" + labelCounter;

        this.code.add(instruction + " " + leftFalseLabel);
        this.code.add(instruction + " " + rightFalseLabel);
        this.code.add(operator.getDefaultValue());
        this.code.add("goto end" + labelCounter);
        this.code.add(leftFalseLabel + ":");
        this.code.add("pop");
        this.code.add(rightFalseLabel + ":");
        this.code.add(operator.getAltValue());
        this.code.add(endOperationLabel + ":");

        this.labelCounter++;

        return null;
    }

    @Override
    public Void visitAddSubExpression(SexyLangParser.AddSubExpressionContext ctx) {
        // If Strings are being added, perform String concatenation
        if (this.types.get(ctx) == DataType.SAFE_WORD) {
            performStringConcatenation(ctx.left, ctx.right);
            return null;
        }

        int tokenIndex = ctx.op.getType();
        OperatorFactory operatorFactory = new OperatorFactory();
        ArithmeticOperator operator = operatorFactory.createArithmeticOperator(tokenIndex);
        generateArithmeticOperationCode(
                ctx.left,
                ctx.right,
                this.types.get(ctx).getMnemonic(),
                operator
        );

        return null;
    }

    @Override
    public Void visitMulDivExpression(SexyLangParser.MulDivExpressionContext ctx) {
        int tokenIndex = ctx.op.getType();
        OperatorFactory operatorFactory = new OperatorFactory();
        ArithmeticOperator operator = operatorFactory.createArithmeticOperator(tokenIndex);
        generateArithmeticOperationCode(
                ctx.left,
                ctx.right,
                this.types.get(ctx).getMnemonic(),
                operator
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
        long ifLabel = labelCounter++;

        visit(ctx.condition);
        this.code.add("ifeq jump" + ifLabel);
        visit(ctx.block());
        this.code.add("goto endif" + ifLabel);
        this.code.add("jump" + ifLabel + ":");

        if (ctx.elseIfStmt() != null) {
            ctx.elseIfStmt().forEach(this::visit);
        }

        if (ctx.elseStmt() != null) {
            visit(ctx.elseStmt());
        }

        this.code.add("endif" + ifLabel + ":");


        return null;
    }

    @Override
    public Void visitElseIfStmt(SexyLangParser.ElseIfStmtContext ctx) {
        long parentIfLabel = labelCounter;
        long thisIfLabel = labelCounter++;
        visit(ctx.condition);
        this.code.add("ifeq jump" + thisIfLabel);
        visit(ctx.block());
        this.code.add("goto endif" + parentIfLabel);
        this.code.add("jump" + thisIfLabel + ":");
        this.code.add("endif" + thisIfLabel + ":");

        return null;
    }

    @Override
    public Void visitBulgeLiteral(SexyLangParser.BulgeLiteralContext ctx) {
        this.code.add(ctx.HARD() != null ? "iconst_1" : "iconst_0");

        return null;
    }

    private void generateArithmeticOperationCode(SexyLangParser.ExpressionContext left,
                                                 SexyLangParser.ExpressionContext right,
                                                 String typeMnemonic,
                                                 ArithmeticOperator operator) {
        visit(left);
        visit(right);

        this.code.add(typeMnemonic + operator.getInstruction());
    }

    private void performStringConcatenation(SexyLangParser.ExpressionContext left,
                                            SexyLangParser.ExpressionContext right) {
        DataType leftType = this.types.get(left);
        DataType rightType = this.types.get(right);
        this.code.add("new java/lang/StringBuilder");
        this.code.add("dup");
        this.code.add("invokespecial java/lang/StringBuilder/<init>()V");
        visit(left);
        this.code.add("invokevirtual java/lang/StringBuilder/append(" + leftType.getDescriptor() + ")Ljava/lang/StringBuilder;");
        visit(right);
        this.code.add("invokevirtual java/lang/StringBuilder/append(" + rightType.getDescriptor() + ")Ljava/lang/StringBuilder;");
        this.code.add("invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;");
    }

    private String getIfInstruction(DataType operandType,
                                    RelationalOperator operator) {
        String ifInstruction = "";
        if (operandType.equals(DataType.BODY_COUNT)) {
            ifInstruction += "if_icmp";
            ifInstruction += operator.getInstruction();
        } else if (operandType.equals(DataType.LENGTH)) {
            this.code.add("fcmpg");
            ifInstruction += "if";
            ifInstruction += operator.getInstruction();
        } else if (operandType.equals(DataType.BULGE)) {
            // only equals operator is allowed
            // otherwise an exception would have been thrown before this
            ifInstruction += "if_icmpne";
        }

        ifInstruction += " jump" + labelCounter;

        return ifInstruction;
    }
}
