package parser.ast;

import parser.Quadruple;

import java.util.ArrayList;

public class WritelnCall extends WriteCall{

    public WritelnCall(){}

    public WritelnCall(ArrayList<Expression> expressions){
        super(expressions);
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
