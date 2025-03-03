package parser.ast;

import parser.DataType;

public class ConstDeclaration extends VariableDeclaration {

    public ConstDeclaration(){

    }

    public ConstDeclaration(String name,DataType dataType) {
        super(dataType, name);
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateCode() {

    }
}
