package parser.ast;

import parser.DataType;
import parser.IRInstruction;
import parser.Quadruple;

import java.util.ArrayList;

public class WriteCall extends Statement{

    protected ArrayList<Expression> expressions;

    public WriteCall(){}

    public WriteCall(ArrayList<Expression> expressions) {
        this.expressions = expressions;
    }

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(ArrayList<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public void traverse() {

    }

    @Override
    public ArrayList<Quadruple> generateIntermediateCode() {
        ArrayList<Quadruple> ir = new ArrayList<>();
        IRInstruction ins = null;
        for(Expression exp : expressions){
            ir.addAll(exp.generateIntermediateCode());
            switch (exp.getReturnType()){
                case DataType.INTEGER -> {
                    ins = IRInstruction.PI;
                    break;
                }
                case DataType.REAL -> {
                    ins = IRInstruction.PR;
                    break;
                }
                case DataType.CHAR -> {
                    ins = IRInstruction.PC;
                    break;
                }
                case DataType.BOOLEAN -> {
                    ins = IRInstruction.PB;
                    break;
                }
                case DataType.STRING -> {
                    ins = IRInstruction.PS;
                    break;
                }
            }
            ir.add(new Quadruple(ins,ir.getLast().getResult(),null,null));
        }
        return ir;
    }

    @Override
    public void generateCode() {

    }
}
