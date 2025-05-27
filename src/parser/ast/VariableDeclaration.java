package parser.ast;

import parser.DataType;
import parser.Quadruple;

import java.io.BufferedWriter;
import java.util.ArrayList;

public class VariableDeclaration extends AST{

    public enum VariableType{
        VARIABLE, ARRAY;
    }

    protected String name;
    protected DataType type;
    protected VariableType variableType;
    protected int length;


    public VariableDeclaration(){
    }

    public VariableDeclaration(String name, DataType type) {
        this.name = name;
        this.type = type;
        this.variableType = VariableType.VARIABLE;
    }

    public VariableDeclaration(String name, DataType type, int length) {
        this.name = name;
        this.type = type;
        this.variableType = VariableType.ARRAY;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public VariableType getVariableType() {
        return variableType;
    }

    public void setVariableType(VariableType variableType) {
        this.variableType = variableType;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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

        System.out.println("VARIABLE_DECLARATION");
        Utils.printBranch(false,level+1);
        System.out.println(type.toString());
        Utils.printBranch(true, level+1);
        System.out.println(name);
    }
}
