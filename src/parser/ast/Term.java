package parser.ast;

import parser.DataType;

import java.util.ArrayList;

public class Term extends AST{
    private Factor firstFactor;
    private ArrayList<String> operands;
    private ArrayList<Factor> otherFactors;

    public Term(){
        this.operands = new ArrayList<>();
        this.otherFactors = new ArrayList<>();
    }

    public Term(Factor firstFactor, ArrayList<String> operands, ArrayList<Factor> otherFactors) {
        this.firstFactor = firstFactor;
        this.operands = operands;
        this.otherFactors = otherFactors;
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateCode() {

    }
}
