package parser.ast;

import parser.IRInstruction;
import parser.Quadruple;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AssignmentStatement extends Statement{
    private Variable variable;
    private Expression expression;

    public AssignmentStatement(){}

    public AssignmentStatement(Variable variable, Expression expression){
        this.variable = variable;
        this.expression = expression;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void traverse() {

    }

    @Override
    public ArrayList<Quadruple> generateIntermediateCode(){
        ArrayList<Quadruple> ir = expression.generateIntermediateCode();
        ir.add(new Quadruple(IRInstruction.MOV,ir.getLast().getResult(),null,variable.getName()));
        return ir;
    }

    @Override
    public void generateCode() {

    }
}
