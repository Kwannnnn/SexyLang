package nl.saxion.cos.symbol;

import nl.saxion.cos.type.DataType;

public class VariableSymbol extends Symbol {
    private final int index;
    private final DataType type;

    public VariableSymbol(String name, int index, DataType type) {
        super(name);
        this.index = index;
        this.type = type;
    }

    public int getIndex() {
        return index;
    }

    public DataType getType() {
        return type;
    }
}
