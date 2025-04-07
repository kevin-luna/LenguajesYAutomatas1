package parser.ast;

import parser.DataType;
import parser.IRInstruction;
import parser.Quadruple;
import parser.TempVarGenerator;

import java.util.ArrayList;

public class SimpleExpression extends AST{
    private Term firstTerm;
    private ArrayList<Term> otherTerms;
    private ArrayList<String> operators;
    private DataType returnType;

    public SimpleExpression(){
        otherTerms = new ArrayList<>();
        operators = new ArrayList<>();
    }

    public SimpleExpression(Term firstTerm, ArrayList<Term> otherTerms, ArrayList<String> operators){
        this.firstTerm = firstTerm;
        this.otherTerms = otherTerms;
        this.operators = operators;
        this.returnType = firstTerm.getReturnType();
    }

    public Term getFirstTerm() {
        return firstTerm;
    }

    public void setFirstTerm(Term firstTerm) {
        this.firstTerm = firstTerm;
    }

    public ArrayList<Term> getOtherTerms() {
        return otherTerms;
    }

    public void setOtherTerms(ArrayList<Term> otherTerms) {
        this.otherTerms = otherTerms;
    }

    public ArrayList<String> getOperators() {
        return operators;
    }

    public void setOperators(ArrayList<String> operators) {
        this.operators = operators;
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
    public ArrayList<Quadruple> generateIntermediateCode() {
        ArrayList<Quadruple> ir = firstTerm.generateIntermediateCode();
        String last = ir.getLast().getResult();
        for(int i = 0,j=0; i<otherTerms.size(); i++,j++){
            ir.addAll(otherTerms.get(i).generateIntermediateCode());
            String current = ir.getLast().getResult();
            ir.add(new Quadruple(
                    decodeInstruction(operators.get(j)),
                    last,
                    current,
                    TempVarGenerator.getNewInstance()
                )
            );
            last = ir.getLast().getResult();
        }
        return ir;
    }

    private IRInstruction decodeInstruction(String operator) {
        switch (operator) {
            case "+" -> {
                return IRInstruction.ADD;
            }
            case "-" -> {
                return IRInstruction.SUB;
            }
            default -> {
                return IRInstruction.OR;
            }
        }
    }

    @Override
    public void generateCode() {

    }

    @Override
    public void print(int level) {
        System.out.println("SIMPLE_EXPRESSION");
        Utils.printIntermediateBranch(level+1);
        firstTerm.print(level+1);
        if(otherTerms.size()>0){
            for(int i = 1,j=0; i<otherTerms.size(); i++,j++){
                Utils.printIntermediateBranch(level+1);
                System.out.println(this.operators.get(j));
                Utils.printBranch(i==otherTerms.size()-1,level+1);
                otherTerms.get(i).print(level+1);
            }
        }

    }
}
