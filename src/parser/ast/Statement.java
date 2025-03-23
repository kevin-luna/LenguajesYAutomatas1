package parser.ast;

import parser.Quadruple;

import java.util.ArrayList;

public abstract class Statement extends AST{
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
