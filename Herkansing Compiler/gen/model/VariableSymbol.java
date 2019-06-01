package model;

import com.oracle.jrockit.jfr.DataType;

public class VariableSymbol {
    private DataType type;
    private String name;

    public VariableSymbol(String name, DataType type) {
        this.type = type;
        this.name = name;
    }

    public DataType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
