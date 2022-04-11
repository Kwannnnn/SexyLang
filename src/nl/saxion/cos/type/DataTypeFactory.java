package nl.saxion.cos.type;

import nl.saxion.cos.SexyLangLexer;
import nl.saxion.cos.exception.CompilerException;

public class DataTypeFactory {
    public DataType createDataType(int tokenIndex) {
        switch (tokenIndex) {
            case SexyLangLexer.BULGE: return DataType.BULGE;
            case SexyLangLexer.BODYCOUNT: return DataType.BODY_COUNT;
            case SexyLangLexer.LENGTH: return DataType.LENGTH;
            case SexyLangLexer.SAFEWORD: return DataType.SAFE_WORD;
            case SexyLangLexer.BODYCOUNT_ARRAY: return DataType.BODY_COUNT_ARRAY;
            case SexyLangLexer.LENGTH_ARRAY: return DataType.LENGTH_ARRAY;
            case SexyLangLexer.BULGE_ARRAY: return DataType.BULGE_ARRAY;
            case SexyLangLexer.SAFEWORD_ARRAY: return DataType.SAFE_WORD_ARRAY;
            case SexyLangLexer.EMPTY: return DataType.EMPTY;
            default: throw new CompilerException("Unsupported data type");
        }
    }
}
