package parser.ast;

import parser.DataType;

public class Factor extends AST{
    private String value;
    private DataType returnType;

    public Factor(){}

    public Factor(String value, DataType returnType) {
        this.value = value;
        this.returnType = returnType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DataType getReturnType() {
        return returnType;
    }

    public void setReturnType(DataType returnType) {
        this.returnType = returnType;
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateCode() {

    }
}
