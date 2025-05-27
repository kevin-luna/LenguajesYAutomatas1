package parser.ast;

import parser.DataType;
import parser.Quadruple;

import java.io.BufferedWriter;
import java.util.ArrayList;

public class ConstDeclaration extends AST {

    private String name;
    private DataType dataType;
    private String value;

    public ConstDeclaration(){

    }

    public ConstDeclaration(String name, DataType dataType, String value) {
        this.name = name;
        this.dataType = dataType;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
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
    public ArrayList<Quadruple> generateIntermediateCode(){

        return null;
    }

    @Override
    public void generateCode(BufferedWriter outputFile) {

    }

    @Override
    public void print(int level) {
        System.out.println("CONST_DECLARATION");
        Utils.printIntermediateBranch(level+1);
        System.out.println(dataType);
        Utils.printLastBranch(level+1);
        System.out.println(name);
    }
}
