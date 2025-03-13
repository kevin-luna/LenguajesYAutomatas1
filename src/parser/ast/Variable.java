package parser.ast;

import parser.DataType;

public class Variable extends AST{
    private String name;
    private DataType dataType;
    private VariableType variableType;
    private Expression index;

    public enum VariableType{
        VARIABLE,ARRAY;
    }

    public Variable(){}

    public Variable(String name, DataType type) {
        this.name = name;
        this.dataType = type;
        this.variableType = VariableType.VARIABLE;
    }

    public Variable(String name, Expression index, DataType type) {
        this.name = name;
        this.index = index;
        this.dataType = type;
        this.variableType = VariableType.ARRAY;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateCode() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
