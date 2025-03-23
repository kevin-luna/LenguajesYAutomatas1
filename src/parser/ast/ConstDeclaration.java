package parser.ast;

import parser.DataType;
import parser.Quadruple;

import java.util.ArrayList;

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
    public ArrayList<Quadruple> generateIntermediateCode(){

        return null;
    }

    @Override
    public void generateCode() {

    }
}
