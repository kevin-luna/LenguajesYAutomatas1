package parser;

public class SymbolEntry {
    private String name;
    private String value;
    private DataType dataType;
    private int size;
    private int dimension;

    public SymbolEntry(){}

    public SymbolEntry(String name, String value, DataType dataType, int size, int dimension) {
        this.name = name;
        this.value = value;
        this.dataType = dataType;
        this.size = size;
        this.dimension = dimension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
