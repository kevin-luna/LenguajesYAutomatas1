package parser.ast;

import parser.DataType;

public class Factor extends AST{
    private Variable variable;
    private UnsignedConstant unsignedConstant;
    private Expression expression;
    private Factor factor;
    private DataType returnType;

    public enum FactorType{
        VARIABLE, UNSIGNED_CONSTANT, EXPRESSION, FACTOR;
    }

    public Factor(){}

    public Factor(Variable variable){
        this.variable = variable;
        this.returnType = variable.getDataType();
    }

    public Factor(UnsignedConstant unsignedConstant){
        this.unsignedConstant = unsignedConstant;
        this.returnType = unsignedConstant.getType();
    }

    public Factor(Expression expression){
        this.expression = expression;
        this.returnType = expression.getReturnType();
    }

    public Factor(Factor factor){
        this.factor = factor;
        this.returnType = factor.getReturnType();
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
    public void generateCode() {

    }
}
