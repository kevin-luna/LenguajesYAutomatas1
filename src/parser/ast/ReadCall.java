package parser.ast;

import java.util.ArrayList;

public class ReadCall extends Statement{

    protected ArrayList<Variable> variables;

    public ReadCall(){}

    public ReadCall(ArrayList<Variable> variables){
        this.variables = variables;
    }

    public ArrayList<Variable> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<Variable> variables) {
        this.variables = variables;
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateCode() {

    }
}
