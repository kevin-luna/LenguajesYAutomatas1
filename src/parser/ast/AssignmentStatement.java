package parser.ast;

import parser.IRInstruction;
import parser.Quadruple;

import java.io.BufferedWriter;
import java.io.IOException;
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
    public void generateCode(BufferedWriter outputFile) {
        try{
            outputFile.write(variable.getName());
            outputFile.write("=");
            expression.generateCode(outputFile);
            outputFile.write(";");
            outputFile.newLine();
        }catch (IOException ioException){
            throw new RuntimeException(ioException);
        }
    }

    @Override
    public void print(int level) {
        System.out.println("ASSIGNMENT_STATEMENT");
        Utils.printIntermediateBranch(level+1);
        variable.print(level+1);
        Utils.printLastBranch(level+1);
        expression.print(level+1);
    }
}
