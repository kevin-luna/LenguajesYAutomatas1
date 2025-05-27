package parser.ast;

import parser.DataType;
import parser.IRInstruction;
import parser.Quadruple;
import parser.TempVarGenerator;

import java.io.BufferedWriter;
import java.util.ArrayList;

public class Term extends AST{
    private Factor firstFactor;
    private ArrayList<String> operators;
    private ArrayList<Factor> otherFactors;
    private DataType returnType;

    public Term(){
        this.operators = new ArrayList<>();
        this.otherFactors = new ArrayList<>();
    }

    public Term(Factor firstFactor, ArrayList<String> operators, ArrayList<Factor> otherFactors) {
        this.firstFactor = firstFactor;
        this.operators = operators;
        this.otherFactors = otherFactors;
        this.returnType = firstFactor.getReturnType();
    }

    public Factor getFirstFactor() {
        return firstFactor;
    }

    public void setFirstFactor(Factor firstFactor) {
        this.firstFactor = firstFactor;
    }

    public ArrayList<String> getOperators() {
        return operators;
    }

    public void setOperators(ArrayList<String> operators) {
        this.operators = operators;
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
        for(int i = 0,j=0; i<otherFactors.size(); i++, j++){
            ir.addAll(otherFactors.get(i).generateIntermediateCode());
            String curr = ir.getLast().getResult();
            IRInstruction ins = decodeInstruction(operators.get(j));
            //Multiplicaciones y divisiones por 1 no se generan
            if(ir.getLast().getOp1().equals("1")){
                if(ins==IRInstruction.MUL || ins==IRInstruction.DIV) {
                    last = curr;
                    continue;
                }
            }
                ir.add(new Quadruple(ins,
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
    public void generateCode(BufferedWriter outputFile) {

    }

    @Override
    public void print(int level) {
        System.out.println("TERM");
        Utils.printIntermediateBranch(level+1);
        firstFactor.print(level+1);
        if(otherFactors.size()>0){
            for(int i = 0,j=0; i<otherFactors.size(); i++,j++){
                Utils.printIntermediateBranch(level+1);
                System.out.println(this.operators.get(j));
                Utils.printBranch(i==otherFactors.size()-1,level+1);
                otherFactors.get(i).print(level+1);
            }
        }
    }
}
