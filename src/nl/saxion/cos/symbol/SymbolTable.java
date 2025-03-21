package nl.saxion.cos.symbol;

import nl.saxion.cos.type.DataType;

import java.util.HashMap;
import java.util.List;

public class SymbolTable {

    private SymbolTable parent;
    private int lastUsedIndex;

    private final HashMap<String, Symbol> symbolTable;

    public SymbolTable() {
        this.symbolTable = new HashMap<>();
    }

    public void addVariableSymbol(String name, DataType type) {
        this.symbolTable.put(name, new VariableSymbol(name, lastUsedIndex++, type));
    }

    public void addMethodSymbol(String name,
                                List<DataType> args,
                                DataType returnType) {
        this.symbolTable.put(name, new MethodSymbol(name, args, returnType));
    }

    public void addArraySymbol(String name, DataType type) {
        this.symbolTable.put(name, new ArraySymbol(name, lastUsedIndex++, type));
    }

    public Symbol lookup(String name) {
        Symbol symbol = this.symbolTable.get(name);

        if (symbol == null && this.parent != null) {
            symbol = this.parent.lookup(name);
        }

        return symbol;
    }

    public SymbolTable openScope() {
        SymbolTable newScope = new SymbolTable();
        newScope.parent = this;
        newScope.lastUsedIndex = this.lastUsedIndex;

        return newScope;
    }

    public SymbolTable closeScope() {
        return parent;
    }
}
