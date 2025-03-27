package parser.ast;

import parser.DataType;
import parser.Quadruple;

import java.util.ArrayList;

public class ConstDeclaration extends AST {

    private String name;
    private DataType dataType;

    public ConstDeclaration(){

    }

    public ConstDeclaration(String name,DataType dataType) {
        this.name = name;
        this.dataType = dataType;
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

    @Override
    public void traverse() {

    }

    @Override
    public ArrayList<Quadruple> generateIntermediateCode(){

        return null;
    }

    @Override
    public void generateCode() {

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
