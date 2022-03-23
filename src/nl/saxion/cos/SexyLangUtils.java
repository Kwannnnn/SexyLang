package nl.saxion.cos;

import nl.saxion.cos.exception.CompilerException;

import java.util.HashSet;
import java.util.Set;

public final class SexyLangUtils {
    public static final Set<DataType> COMPARABLE_DATA_TYPES = new HashSet<DataType>() {{
        add(DataType.BODY_COUNT);
        add(DataType.LENGTH);
    }};

    public static final Set<DataType> COMPUTABLE_DATA_TYPES = new HashSet<DataType>() {{
        add(DataType.LENGTH);
        add(DataType.BODY_COUNT);
    }};

    public static String getOperatorInstruction(int operatorIndex) {
        switch (operatorIndex) {
            case SexyLangLexer.ADD: return "add";
            case SexyLangLexer.SUB: return "sub";
            case SexyLangLexer.MUL: return "mul";
            case SexyLangLexer.DIV: return "div";
            default: throw new CompilerException("Unsupported arithmetic operator");
        }
    }

    public static DataType getDataType(int keywordIndex) {
        switch (keywordIndex) {
            case SexyLangLexer.BULGE: return DataType.BULGE;
            case SexyLangLexer.BODYCOUNT: return DataType.BODY_COUNT;
            case SexyLangLexer.LENGTH: return DataType.LENGTH;
            case SexyLangLexer.SAFEWORD: return DataType.SAFE_WORD;
            default: throw new CompilerException("Unsupported data type");
        }
    }

    public static String getIncompatibleOperandsMessage(String operator,
                                                 DataType leftOperandType,
                                                 DataType rightOperandType) {
        return "Operator '" + operator + "'" + " cannot be applied to " +
                leftOperandType.getName() + " and " +
                rightOperandType.getName() + " operands.";
    }
}
