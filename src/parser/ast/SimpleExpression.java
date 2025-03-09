package parser.ast;

import parser.DataType;

public class SimpleExpression extends AST{
    private DataType returnType;
    private String operator;
    private Term left;
    private Term right;

    public SimpleExpression(){}

    public SimpleExpression(DataType returnType, String operator, Term left, Term right) {
        this.returnType = returnType;
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    public DataType getReturnType() {
        return returnType;
    }

    public void setReturnType(DataType returnType) {
        this.returnType = returnType;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Term getLeft() {
        return left;
    }

    public void setLeft(Term left) {
        this.left = left;
    }

    public Term getRight() {
        return right;
    }

    public void setRight(Term right) {
        this.right = right;
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateCode() {

    }
}
