package parser.ast;

import parser.DataType;
import parser.Quadruple;

import java.io.BufferedWriter;
import java.util.ArrayList;

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
    public ArrayList<Quadruple> generateIntermediateCode() {
        return null;
    }

    @Override
    public void generateCode(BufferedWriter outputFile) {

    }

    @Override
    public void print(int level) {
        System.out.println("UNSIGNED_CONSTANT");
        Utils.printLastBranch(level+1);
        System.out.println(value);
    }
}
