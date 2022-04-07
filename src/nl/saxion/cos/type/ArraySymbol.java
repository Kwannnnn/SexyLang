package nl.saxion.cos.type;

import nl.saxion.cos.DataType;

public class ArraySymbol extends Symbol{
    private final int index;
    private final DataType type;

    public ArraySymbol(String name, int index, DataType type) {
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
