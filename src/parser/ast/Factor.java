package parser.ast;

import parser.DataType;
import parser.IRInstruction;
import parser.Quadruple;
import parser.TempVarGenerator;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Factor extends AST{
    private Variable variable;
    private UnsignedConstant unsignedConstant;
    private Expression expression;
    private boolean evalFirst;
    private Factor factor;
    private DataType returnType;
    private Boolean negated;
    private FactorType type;

    public enum FactorType{
        VARIABLE, UNSIGNED_CONSTANT, EXPRESSION, FACTOR;
    }

    public Factor(){
    }

    public Factor(Variable variable){
        this.variable = variable;
        this.returnType = variable.getDataType();
        this.type = FactorType.VARIABLE;
    }

    public Factor(UnsignedConstant unsignedConstant){
        this.unsignedConstant = unsignedConstant;
        this.returnType = unsignedConstant.getType();
        this.type = FactorType.UNSIGNED_CONSTANT;
    }

    public Factor(Expression expression, boolean evalFirst){
        this.expression = expression;
        this.returnType = expression.getReturnType();
        this.evalFirst = evalFirst;
        this.type = FactorType.EXPRESSION;
    }

    public Factor(Factor factor){
        this.factor = factor;
        this.returnType = factor.getReturnType();
        this.type = FactorType.FACTOR;
    }

    public Factor(Factor variable, boolean negated){
        this.variable = variable.getVariable();
        this.negated = negated;
        this.returnType = DataType.BOOLEAN;
        this.type = FactorType.FACTOR;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public UnsignedConstant getUnsignedConstant() {
        return unsignedConstant;
    }

    public void setUnsignedConstant(UnsignedConstant unsignedConstant) {
        this.unsignedConstant = unsignedConstant;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public boolean isEvalFirst() {
        return evalFirst;
    }

    public void setEvalFirst(boolean evalFirst) {
        this.evalFirst = evalFirst;
    }

    public Factor getFactor() {
        return factor;
    }

    public void setFactor(Factor factor) {
        this.factor = factor;
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
        ArrayList<Quadruple> ir = new ArrayList<>();
        if(variable!=null){
            ir.add(new Quadruple(IRInstruction.MOV,variable.getName(),null, TempVarGenerator.getNewInstance()));
        }else if(unsignedConstant!=null){
            ir.add(new Quadruple(IRInstruction.MOV,unsignedConstant.getValue(),null,TempVarGenerator.getNewInstance()));
        }else if(expression!=null){
            ir.addAll(expression.generateIntermediateCode());
        }else if(factor!=null){
            ir.addAll(factor.generateIntermediateCode());
            ir.add(new Quadruple(IRInstruction.NOT, ir.getLast().getResult(),null, TempVarGenerator.getNewInstance()));
        }
        return ir;
    }

    @Override
    public void generateCode(BufferedWriter outputFile) {
        try{
            switch (this.type){
                case VARIABLE -> {
                    outputFile.write(variable.getName());
                    break;
                }
                case UNSIGNED_CONSTANT -> {
                    outputFile.write(unsignedConstant.getValue());
                    break;
                }
                case EXPRESSION -> {
                    if(this.evalFirst)outputFile.write("(");
                    expression.generateCode(outputFile);
                    if(this.evalFirst)outputFile.write(")");
                    break;
                }
                case FACTOR -> {
                    if(this.negated!=null)outputFile.write("!");
                    factor.generateCode(outputFile);
                    break;
                }
            }
        }catch (IOException ioException){
            throw new RuntimeException(ioException);
        }
    }

    @Override
    public void print(int level) {
        System.out.println("FACTOR");
        Utils.printLastBranch(level+1);
        if(variable!=null){
            if(negated!=null){
                System.out.println("NOT");
                Utils.printIntermediateBranch(level+1);
            }
            variable.print(level+1);
        }else if(unsignedConstant!=null){
            unsignedConstant.print(level+1);
        }else if(expression!=null){
            expression.print(level+1);
        }else if(factor!=null){
            factor.print(level+1);
        }
    }
}
