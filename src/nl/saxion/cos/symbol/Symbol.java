package nl.saxion.cos.symbol;

public abstract class Symbol {
    private final String name;

    public Symbol(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
