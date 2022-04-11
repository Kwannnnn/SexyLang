package nl.saxion.cos;

import nl.saxion.cos.exception.CompilerException;
import nl.saxion.cos.type.DataType;

import java.util.HashSet;
import java.util.Set;

public final class SexyLangUtils {
    public static final Set<DataType> PRIMITIVE_DATA_TYPES = new HashSet<DataType>() {{
        add(DataType.BODY_COUNT);
        add(DataType.LENGTH);
        add(DataType.BULGE);
        add(DataType.SAFE_WORD);
    }};

    public static final Set<DataType> ARRAY_DATA_TYPES = new HashSet<DataType>() {{
        add(DataType.BODY_COUNT_ARRAY);
        add(DataType.LENGTH_ARRAY);
        add(DataType.BULGE_ARRAY);
        add(DataType.SAFE_WORD_ARRAY);
    }};

    public static final Set<DataType> COMPARABLE_DATA_TYPES = new HashSet<DataType>() {{
        add(DataType.BODY_COUNT);
        add(DataType.LENGTH);
    }};

    public static final Set<DataType> COMPUTABLE_DATA_TYPES = new HashSet<DataType>() {{
        add(DataType.LENGTH);
        add(DataType.BODY_COUNT);
    }};

    public static DataType getArrayElementType(DataType arrayType) {
        switch (arrayType) {
            case BODY_COUNT_ARRAY: return DataType.BODY_COUNT;
            case LENGTH_ARRAY: return DataType.LENGTH;
            case BULGE_ARRAY: return DataType.BULGE;
            case SAFE_WORD_ARRAY: return DataType.SAFE_WORD;
            default: throw new CompilerException("Unsupported array type");
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
