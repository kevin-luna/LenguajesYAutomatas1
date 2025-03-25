package parser.ast;

import parser.DataType;
import parser.IRInstruction;
import parser.Quadruple;
import parser.TempVarGenerator;

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

    public ArrayList<Quadruple> generateIntermediateCode() {
        ArrayList<Quadruple> ir = firstFactor.generateIntermediateCode();
        String last = ir.getLast().getResult();
        for(int i = 1,j=0; i<otherFactors.size(); i++, j++){
            ir.addAll(otherFactors.get(i).generateIntermediateCode());
            String curr = ir.getLast().getResult();
            ir.add(new Quadruple(decodeInstruction(operands.get(j)),
                    last,
                    curr,
                    TempVarGenerator.getNewInstance()
                    )
            );
            last = ir.getLast().getResult();
        }
        return ir;
    }

    private IRInstruction decodeInstruction(String operator){
        switch (operator){
            case "*" -> {
                return IRInstruction.MUL;
            }
            case "AND" -> {
                return IRInstruction.AND;
            }
            case "MOD" -> {
                return IRInstruction.MOD;
            }
            default -> {
                return IRInstruction.DIV;
            }
        }
    }

    @Override
    public void generateCode() {

    }
}
