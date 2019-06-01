package model;

import com.oracle.jrockit.jfr.DataType;

public class VariableSymbol {
    private DataType type;
    private String name;
    private int storageIndex;

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

    public int getStorageIndex() {
        return storageIndex;
    }

    public void setStorageIndex(int storageIndex) {
        this.storageIndex = storageIndex;
    }
}
