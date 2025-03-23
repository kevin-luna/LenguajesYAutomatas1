package parser.ast;

import parser.Quadruple;

import java.util.ArrayList;

public class ReadlnCall extends ReadCall{

    public ReadlnCall(){}

    public ReadlnCall(ArrayList<Variable> variables) {
        super(variables);
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
