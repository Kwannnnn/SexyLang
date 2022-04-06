package nl.saxion.cos.type;

import nl.saxion.cos.DataType;

public class MethodSymbol extends Symbol {
    private final String args;
    private final DataType returnType;

    public MethodSymbol(String methodName,
                        String args,
                        DataType returnType) {
        super(methodName);
        this.args = args;
        this.returnType = returnType;

    }

    public DataType getReturnType() {
        return returnType;
    }

    public String getSignature() {
        return super.getName() + "(" + this.args + ")"
                + this.returnType.getDescriptor();
    }
}
