package nl.saxion.cos;

import nl.saxion.cos.exception.CompilerException;
import org.antlr.v4.runtime.Vocabulary;

import java.util.HashSet;
import java.util.Set;

public final class SexyLangUtils {
    private static final Vocabulary vocabulary = SexyLangLexer.VOCABULARY;

    public static final Set<DataType> COMPARABLE_DATA_TYPES = new HashSet<DataType>() {{
        add(DataType.BULGE);
        add(DataType.BODY_COUNT);
        add(DataType.LENGTH);
    }};

    public static final Set<DataType> COMPUTABLE_DATA_TYPES = new HashSet<DataType>() {{
        add(DataType.LENGTH);
        add(DataType.BODY_COUNT);
    }};

    // Type Keywords
    public static final String BULGE_KEYWORD = vocabulary.getLiteralName(SexyLangLexer.BULGE).replace("'", "");
    public static final String BODYCOUNT_KEYWORD = vocabulary.getLiteralName(SexyLangLexer.BODYCOUNT).replace("'", "");
    public static final String LENGTH_KEYWORD = vocabulary.getLiteralName(SexyLangLexer.LENGTH).replace("'", "");
    public static final String SAFEWORD_KEYWORD = vocabulary.getLiteralName(SexyLangLexer.SAFEWORD).replace("'", "");

    public static final String MOAN_KEYWORD = vocabulary.getLiteralName(SexyLangLexer.MOAN).replace("'", "");
    public static final String INSERT_KEYWORD = vocabulary.getLiteralName(SexyLangLexer.INSERT).replace("'", "");
    public static final String IN_KEYWORD = vocabulary.getLiteralName(SexyLangLexer.IN).replace("'", "");
    public static final String HARD_KEYWORD = vocabulary.getLiteralName(SexyLangLexer.HARD).replace("'", "");
    public static final String SOFT_KEYWORD = vocabulary.getLiteralName(SexyLangLexer.HARD).replace("'", "");

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
