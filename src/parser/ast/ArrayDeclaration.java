package parser.ast;

import parser.DataType;

import java.util.ArrayList;

public class ArrayDeclaration extends VariableDeclaration{

    private int length;
    private int dimension;

    public ArrayDeclaration(){

    }

    public ArrayDeclaration(int length, int dimension) {
        this.length = length;
        this.dimension = dimension;
    }

    public ArrayDeclaration(String name,DataType dataType, int length, int dimension) {
        super(dataType, name);
        this.length = length;
        this.dimension = dimension;
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateCode() {

    }
}
