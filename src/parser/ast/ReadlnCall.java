package parser.ast;

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
    public void generateCode() {

    }
}
