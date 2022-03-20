package nl.saxion.cos;

public enum DataType {
    BODY_COUNT("I", "i", SexyLangLexer.VOCABULARY.getLiteralName(SexyLangLexer.BODYCOUNT)),
    SAFE_WORD("Ljava/lang/String;", "a", SexyLangLexer.VOCABULARY.getLiteralName(SexyLangLexer.SAFEWORD)),
    LENGTH("F", "f", SexyLangLexer.VOCABULARY.getLiteralName(SexyLangLexer.LENGTH)),
    BULGE("Z", "i", SexyLangLexer.VOCABULARY.getLiteralName(SexyLangLexer.BULGE));

    private final String descriptor;
    private final String mnemonic;
    private final String name;

    DataType(String descriptor, String mnemonic, String name) {
        this.descriptor = descriptor;
        this.mnemonic = mnemonic;
        this.name = name;
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
