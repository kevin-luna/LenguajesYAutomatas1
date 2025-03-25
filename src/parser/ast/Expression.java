package parser.ast;

import parser.DataType;
import parser.IRInstruction;
import parser.Quadruple;
import parser.TempVarGenerator;

import java.util.ArrayList;

public class Expression extends AST{
    private DataType returnType;
    private String operator;
    private SimpleExpression leftOperand;
    private SimpleExpression rightOperand;

    public Expression(){}

    public Expression(DataType returnType,SimpleExpression leftOperand){
        this.returnType = returnType;
        this.leftOperand = leftOperand;
        this.operator = "";
        this.rightOperand = null;
    }

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
    public ArrayList<Quadruple> generateIntermediateCode() {
        ArrayList<Quadruple> ir = new ArrayList<>();
        String leftResult, rightResult;
        ir.addAll(leftOperand.generateIntermediateCode());
        leftResult = ir.getLast().getResult();
        if(rightOperand != null){
            ir.addAll(rightOperand.generateIntermediateCode());
            rightResult = ir.getLast().getResult();
            ir.add(new Quadruple(decodeInstruction(this.operator),leftResult,rightResult, TempVarGenerator.getNewInstance()));
        }else ir.add(new Quadruple(IRInstruction.MOV,leftResult,null, TempVarGenerator.getNewInstance()));

        return ir;
    }

    private IRInstruction decodeInstruction(String operator){
        switch (operator){
            case "=" -> {
                return IRInstruction.EQ;
            }
            case "<>" -> {
                return IRInstruction.NEQ;
            }
            case ">" -> {
                return IRInstruction.GT;
            }
            case "<" -> {
                return IRInstruction.LT;
            }
            case ">=" -> {
                return IRInstruction.GEQ;
            }
            case "<=" -> {
                return IRInstruction.LEQ;
            }
            default -> {
                return null;
            }
        }
    }

    @Override
    public void generateCode() {

    }
}
