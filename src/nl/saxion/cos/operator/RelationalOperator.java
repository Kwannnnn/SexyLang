package nl.saxion.cos.operator;

import nl.saxion.cos.SexyLangLexer;

public enum RelationalOperator {
    EQUAL(SexyLangLexer.VOCABULARY.getDisplayName(SexyLangLexer.EQUAL), "ne"),
    NOT_EQUAL(SexyLangLexer.VOCABULARY.getDisplayName(SexyLangLexer.NOT_EQUAL), "eq"),
    GT(SexyLangLexer.VOCABULARY.getDisplayName(SexyLangLexer.GT), "le"),
    LT(SexyLangLexer.VOCABULARY.getDisplayName(SexyLangLexer.LT), "ge"),
    GE(SexyLangLexer.VOCABULARY.getDisplayName(SexyLangLexer.GE), "lt"),
    LE(SexyLangLexer.VOCABULARY.getDisplayName(SexyLangLexer.LE), "gt");

    private final String token;
    private final String instruction;

    RelationalOperator(String token, String instruction) {
        this.token = token.replace("'", "");
        this.instruction = instruction;
    }

    public String getToken() {
        return this.token;
    }

    public String getInstruction() {
        return this.instruction;
    }
}
