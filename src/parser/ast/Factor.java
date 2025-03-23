package parser.ast;

import parser.DataType;
import parser.Quadruple;

import java.util.ArrayList;

public class Factor extends AST{
    private Variable variable;
    private UnsignedConstant unsignedConstant;
    private Expression expression;
    private boolean evalFirst;
    private Factor factor;
    private DataType returnType;
    private Boolean negated;

    public enum FactorType{
        VARIABLE, UNSIGNED_CONSTANT, EXPRESSION, FACTOR;
    }

    public Factor(){
    }

    public Factor(Variable variable){
        this.variable = variable;
        this.returnType = variable.getDataType();
    }

    public Factor(UnsignedConstant unsignedConstant){
        this.unsignedConstant = unsignedConstant;
        this.returnType = unsignedConstant.getType();
    }

    public Factor(Expression expression, boolean evalFirst){
        this.expression = expression;
        this.returnType = expression.getReturnType();
        this.evalFirst = evalFirst;
    }

    public Factor(Factor factor){
        this.factor = factor;
        this.returnType = factor.getReturnType();
    }

    public Factor(Factor variable, boolean negated){
        this.variable = variable.getVariable();
        this.negated = negated;
        this.returnType = DataType.BOOLEAN;
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
        return null;
    }

    @Override
    public void generateCode() {

    }
}
