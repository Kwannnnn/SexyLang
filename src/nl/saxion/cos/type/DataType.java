package nl.saxion.cos.type;

import nl.saxion.cos.SexyLangLexer;

public enum DataType {
    EMPTY("V", "", SexyLangLexer.VOCABULARY.getDisplayName(SexyLangLexer.EMPTY)),
    BODY_COUNT("I", "i", SexyLangLexer.VOCABULARY.getLiteralName(SexyLangLexer.BODYCOUNT)),
    SAFE_WORD("Ljava/lang/String;", "a", SexyLangLexer.VOCABULARY.getLiteralName(SexyLangLexer.SAFEWORD)),
    LENGTH("F", "f", SexyLangLexer.VOCABULARY.getLiteralName(SexyLangLexer.LENGTH)),
    BULGE("Z", "i", SexyLangLexer.VOCABULARY.getLiteralName(SexyLangLexer.BULGE)),
    BODY_COUNT_ARRAY("[I", "a", SexyLangLexer.VOCABULARY.getLiteralName(SexyLangLexer.BODYCOUNT_ARRAY)),
    LENGTH_ARRAY("[F", "a", SexyLangLexer.VOCABULARY.getLiteralName(SexyLangLexer.LENGTH_ARRAY)),
    BULGE_ARRAY("[I", "a", SexyLangLexer.VOCABULARY.getLiteralName(SexyLangLexer.BULGE_ARRAY)),
    SAFE_WORD_ARRAY("[Ljava/lang/String;", "a", SexyLangLexer.VOCABULARY.getLiteralName(SexyLangLexer.SAFEWORD_ARRAY));

    private final String descriptor;
    private final String mnemonic;
    private final String name;

    DataType(String descriptor, String mnemonic, String name) {
        this.descriptor = descriptor;
        this.mnemonic = mnemonic;
        this.name = name.replace("'", "");
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public String getMnemonic() {
        return this.mnemonic;
    }

    public String getName() {
        return name;
    }
}
