package nl.saxion.cos.type;

import nl.saxion.cos.DataType;

import java.util.List;

public class MethodSymbol extends Symbol {
    private final List<Symbol> args;
    private final DataType returnType;

    public MethodSymbol(String methodName,
                        List<Symbol> args,
                        DataType returnType) {
        super(methodName);
        this.args = args;
        this.returnType = returnType;

    }

    public String getSignature() {
//        return super.getName() + "(" + String.join("", args);
        return "";
    }
}
