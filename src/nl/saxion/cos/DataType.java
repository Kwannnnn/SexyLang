package nl.saxion.cos;

public enum DataType {
    BODY_COUNT("I", "i"),
    SAFE_WORD("Ljava/lang/String;", "a"),
    LENGTH("F", "f"),
    BULGE("Z", "i");

    private final String descriptor;
    private final String mnemonic;

    DataType(String descriptor, String mnemonic) {
        this.descriptor = descriptor;
        this.mnemonic = mnemonic;
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public String getMnemonic() {
        return this.mnemonic;
    }
}
