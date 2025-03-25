package parser.ast;

import parser.DataType;
import parser.IRInstruction;
import parser.Quadruple;

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
    public ArrayList<Quadruple> generateIntermediateCode() {
        ArrayList<Quadruple> ir = new ArrayList<>();
        IRInstruction ins = null;
        for(Variable var : variables){
            switch (var.getDataType()){
                case DataType.INTEGER -> {
                    ins = IRInstruction.RI;
                    break;
                }
                case DataType.REAL -> {
                    ins = IRInstruction.RR;
                    break;
                }
                case DataType.CHAR -> {
                    ins = IRInstruction.RC;
                    break;
                }
                case DataType.BOOLEAN -> {
                    ins = IRInstruction.RB;
                    break;
                }
                case DataType.STRING -> {
                    ins = IRInstruction.RS;
                    break;
                }
            }
            ir.add(new Quadruple(IRInstruction.RI,var.getName()));
        }
        return ir;
    }

    @Override
    public void generateCode() {

    }
}
