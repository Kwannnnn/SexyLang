package nl.saxion.cos.type;

import nl.saxion.cos.DataType;

import java.util.HashMap;

public class SymbolTable {
    private int lastUsedIndex;
    private final HashMap<String, Symbol> symbolTable = new HashMap<>();

    public void addVariableSymbol(String name, DataType type) {
        this.symbolTable.put(name, new VariableSymbol(name, ++lastUsedIndex, type));
    }

    public Symbol lookup(String name) {
        return this.symbolTable.get(name);
    }
}
