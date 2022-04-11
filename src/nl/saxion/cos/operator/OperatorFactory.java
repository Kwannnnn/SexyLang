package nl.saxion.cos.operator;

import nl.saxion.cos.SexyLangLexer;
import nl.saxion.cos.exception.CompilerException;

public class OperatorFactory {
    public ArithmeticOperator createArithmeticOperator(int operatorIndex) {
        switch (operatorIndex) {
            case SexyLangLexer.ADD: return ArithmeticOperator.ADD;
            case SexyLangLexer.SUB: return ArithmeticOperator.SUB;
            case SexyLangLexer.MUL: return ArithmeticOperator.MUL;
            case SexyLangLexer.DIV: return ArithmeticOperator.DIV;
            default: throw new CompilerException("Unsupported arithmetic operator");
        }
    }

    public RelationalOperator createRelationalOperator(int operatorIndex) {
        switch (operatorIndex) {
            case SexyLangLexer.EQUAL: return RelationalOperator.EQUAL;
            case SexyLangLexer.NOT_EQUAL: return RelationalOperator.NOT_EQUAL;
            case SexyLangLexer.GT: return RelationalOperator.GT;
            case SexyLangLexer.LT: return RelationalOperator.LT;
            case SexyLangLexer.GE: return RelationalOperator.GE;
            case SexyLangLexer.LE: return RelationalOperator.LE;
            default: throw new CompilerException("Unsupported relational operator");
        }
    }

    public LogicalOperator createLogicalOperator(int operatorIndex) {
        switch (operatorIndex) {
            case SexyLangLexer.AND: return LogicalOperator.AND;
            case SexyLangLexer.OR: return LogicalOperator.OR;
            case SexyLangLexer.NEG: return LogicalOperator.NEG;
            default: throw new CompilerException("Unsupported logical operator");
        }
    }
}
