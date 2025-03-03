package parser.ast;

import parser.DataType;

import java.util.ArrayList;

public class VariableDeclaration extends AST{
    protected String name;
    protected DataType type;

    public VariableDeclaration(){
    }

    public VariableDeclaration(DataType type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public void checkSemantics() {

    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateCode() {

    }
}
