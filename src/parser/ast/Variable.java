package parser.ast;

import parser.DataType;
import parser.Quadruple;

import java.io.BufferedWriter;
import java.util.ArrayList;

public class Variable extends AST{
    private String name;
    private DataType dataType;
    private VariableType variableType;
    private Expression index;

    public enum VariableType{
        VARIABLE,ARRAY;

        public String toString(){
            switch(this){
                case VARIABLE:
                    return "VARIABLE";
                case ARRAY:
                    return "ARRAY";
                default:
                    return "UNKNOWN";
            }
        }
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
    public ArrayList<Quadruple> generateIntermediateCode() {
        return null;
    }

    @Override
    public void generateCode(BufferedWriter outputFile) {

    }

    @Override
    public void print(int level) {
        System.out.println("VARIABLE");
        Utils.printIntermediateBranch(level+1);
        System.out.println(variableType);
        Utils.printIntermediateBranch(level+1);
        System.out.println(dataType);
        Utils.printIntermediateBranch(level+1);
        System.out.println(name);
        if(index!=null){
            index.print(level+1);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
