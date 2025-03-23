package parser.ast;

import parser.DataType;

import java.util.ArrayList;

public class Term extends AST{
    private Factor firstFactor;
    private ArrayList<String> operands;
    private ArrayList<Factor> otherFactors;
    private DataType returnType;

    public Term(){
        this.operands = new ArrayList<>();
        this.otherFactors = new ArrayList<>();
    }

    public Term(Factor firstFactor, ArrayList<String> operands, ArrayList<Factor> otherFactors) {
        this.firstFactor = firstFactor;
        this.operands = operands;
        this.otherFactors = otherFactors;
        this.returnType = firstFactor.getReturnType();
    }

    public Factor getFirstFactor() {
        return firstFactor;
    }

    public void setFirstFactor(Factor firstFactor) {
        this.firstFactor = firstFactor;
    }

    public ArrayList<String> getOperands() {
        return operands;
    }

    public void setOperands(ArrayList<String> operands) {
        this.operands = operands;
    }

    public ArrayList<Factor> getOtherFactors() {
        return otherFactors;
    }

    public void setOtherFactors(ArrayList<Factor> otherFactors) {
        this.otherFactors = otherFactors;
    }

    public DataType getReturnType() {
        return returnType;
    }

    public void setReturnType(DataType returnType) {
        this.returnType = returnType;
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateIntermediateCode() {

    }

    @Override
    public void generateCode() {

    }
}
