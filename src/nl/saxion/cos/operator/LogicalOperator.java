package nl.saxion.cos.operator;

import nl.saxion.cos.SexyLangLexer;

public enum LogicalOperator {
    AND(SexyLangLexer.VOCABULARY.getDisplayName(SexyLangLexer.AND), "ifeq", "iconst_1", "iconst_0"),
    OR(SexyLangLexer.VOCABULARY.getDisplayName(SexyLangLexer.OR), "ifne", "iconst_0", "iconst_1"),
    NEG(SexyLangLexer.VOCABULARY.getDisplayName(SexyLangLexer.NEG), "ifeq", "iconst_1", "iconst_0");

    private final String token;
    private final String instruction;
    private final String defaultValue;
    private final String altValue;

    LogicalOperator(String token, String instruction, String defaultValue, String altValue) {
        this.token = token;
        this.instruction = instruction;
        this.defaultValue = defaultValue;
        this.altValue = altValue;
    }

    public String getToken() {
        return this.token;
    }

    public String getInstruction() {
        return this.instruction;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public String getAltValue() {
        return this.altValue;
    }
}
