package parser.ast;

import parser.DataType;

public class UnsignedConstant extends AST{
    protected DataType type;
    protected String value;

    public UnsignedConstant(){}

    public UnsignedConstant(String value, DataType type) {
        this.value = value;
        this.type = type;
    }

    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateIntermediateCode() {

    }

    @Override
    public void generateCode() {

    }
}
