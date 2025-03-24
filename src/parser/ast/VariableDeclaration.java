package parser.ast;

import parser.DataType;
import parser.IRInstruction;
import parser.Quadruple;

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
    public void traverse() {

    }

    @Override
    public ArrayList<Quadruple> generateIntermediateCode() {
        return null;
    }

    @Override
    public void generateCode() {

    }
}
