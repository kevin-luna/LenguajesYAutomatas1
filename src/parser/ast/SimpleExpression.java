package parser.ast;

import parser.DataType;
import parser.Quadruple;

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
        return null;
    }

    @Override
    public void generateCode() {

    }
}
