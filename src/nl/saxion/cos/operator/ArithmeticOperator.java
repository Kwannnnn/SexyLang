package nl.saxion.cos.operator;

import nl.saxion.cos.SexyLangLexer;

public enum ArithmeticOperator {
    ADD(SexyLangLexer.VOCABULARY.getDisplayName(SexyLangLexer.ADD), "add"),
    SUB(SexyLangLexer.VOCABULARY.getDisplayName(SexyLangLexer.SUB), "sub"),
    MUL(SexyLangLexer.VOCABULARY.getDisplayName(SexyLangLexer.MUL), "mul"),
    DIV(SexyLangLexer.VOCABULARY.getDisplayName(SexyLangLexer.DIV), "div");

    private final String token;
    private final String instruction;

    ArithmeticOperator(String token, String instruction) {
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
