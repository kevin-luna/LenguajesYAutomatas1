package parser.ast;

import parser.DataType;

public class Expression extends AST{
    private DataType returnType;
    private String operator;
    private SimpleExpression leftOperand;
    private SimpleExpression rightOperand;

    public Expression(){}

    public Expression(DataType returnType, String operator, SimpleExpression leftOperand, SimpleExpression rightOperand) {
        this.returnType = returnType;
        this.operator = operator;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public void eval(){

    }

    public DataType getReturnType() {
        return returnType;
    }

    public void setReturnType(DataType returnType) {
        this.returnType = returnType;
    }

    public SimpleExpression getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(SimpleExpression leftOperand) {
        this.leftOperand = leftOperand;
    }

    public SimpleExpression getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(SimpleExpression rightOperand) {
        this.rightOperand = rightOperand;
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateCode() {

    }
}
