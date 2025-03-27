package parser.ast;

import parser.Quadruple;

import java.util.ArrayList;

public class ContinueStatement extends Statement {
    public ContinueStatement(){}

    @Override
    public ArrayList<Quadruple> generateIntermediateCode(){
        return null;
    }

    @Override
    public void print(int level) {

    }
}
