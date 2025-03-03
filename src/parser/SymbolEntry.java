package parser;

import parser.ast.VariableDeclaration;

public class SymbolEntry {
    private String name;
    private String value;
    private int defLine;
    private SymbolType type;
    private DataType dataType;
    private int len;
    private int size;
    private int dimension;

    public SymbolEntry(){}

    public SymbolEntry(String name, String value, int defLine, SymbolType type, DataType dataType, int len, int dimension) {
        this.name = name;
        this.value = value;
        this.defLine = defLine;
        this.type = type;
        this.dataType = dataType;
        this.len = len;
        this.size = len*DataTypes.getSize(dataType);
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

    public int getDefLine() {
        return defLine;
    }

    public void setDefLine(int defLine) {
        this.defLine = defLine;
    }

    public SymbolType getType() {
        return type;
    }

    public void setType(SymbolType type) {
        this.type = type;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
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

    public VariableDeclaration getVariableDeclaration(){
        return new VariableDeclaration(dataType,name);
    }
}
