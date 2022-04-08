package nl.saxion.cos.type;

import nl.saxion.cos.DataType;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MethodSymbol extends Symbol {
    // TODO: Ask whether name key is necessary
    private final List<DataType> args;
    private final DataType returnType;

    public MethodSymbol(String methodName,
                        List<DataType> args,
                        DataType returnType) {
        super(methodName);
        this.args = args;
        this.returnType = returnType;

    }

    public DataType getReturnType() {
        return returnType;
    }

    public String getSignature() {
        return super.getName() + "(" + this.getArgDescriptorsString() + ")"
                + this.returnType.getDescriptor();
    }

    public List<DataType> getArgs() {
        return this.args;
    }

    public DataType getDataTypeAtIndex(int index) {
        // TODO: Use an optional
        if (index < 0 || index >= this.args.size()) {
            return null;
        }

        return this.args.get(index);
    }

    private String getArgDescriptorsString() {
        return this.args.stream()
                .map(DataType::getDescriptor)
                .collect(Collectors.joining());
    }
}
