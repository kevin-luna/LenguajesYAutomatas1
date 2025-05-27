package parser.ast;

import parser.IRInstruction;
import parser.Quadruple;
import parser.TempLblGenerator;

import java.io.BufferedWriter;
import java.util.ArrayList;

public class ForStatement extends Statement{
    private Variable variable;
    private Expression initialValue;
    private ForMode forMode;
    private Expression goal;
    private Statement statement;
    private CodeBlock codeBlock;

    public enum ForMode{
        TO,DOWNTO;
    }

    public ForStatement() {}

    public ForStatement(Variable variable, Expression initialValue, ForMode forMode, Expression goal, Statement statement){
        this.variable = variable;
        this.initialValue = initialValue;
        this.forMode = forMode;
        this.goal = goal;
        this.statement = statement;
    }

    public ForStatement(Variable variable, Expression initialValue, ForMode forMode, Expression goal, CodeBlock codeBlock){
        this.variable = variable;
        this.initialValue = initialValue;
        this.forMode = forMode;
        this.goal = goal;
        this.codeBlock = codeBlock;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public Expression getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(Expression initialValue) {
        this.initialValue = initialValue;
    }

    public ForMode getForMode() {
        return forMode;
    }

    public void setForMode(ForMode forMode) {
        this.forMode = forMode;
    }

    public Expression getGoal() {
        return goal;
    }

    public void setGoal(Expression goal) {
        this.goal = goal;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public CodeBlock getCodeBlock() {
        return codeBlock;
    }

    public void setCodeBlock(CodeBlock codeBlock) {
        this.codeBlock = codeBlock;
    }

    @Override
    public void traverse() {

    }

    @Override
    public ArrayList<Quadruple> generateIntermediateCode() {
        ArrayList<Quadruple> ir = new ArrayList<>();
        ir.addAll(initialValue.generateIntermediateCode());//Evalua el valor inicial del acumulador y almacena el resultado en una variable temporal
        String ac = this.variable.getName();
        ir.addAll(goal.generateIntermediateCode());

        String label = TempLblGenerator.getNewInstance();
        ir.add(new Quadruple(IRInstruction.IF, ir.getLast().getResult(), label,null));

        ir.add(new Quadruple(IRInstruction.LBL, label));//Inicio de etiqueta

        //Genera codigo que se ejecutara dentro del IF
        if(statement!=null)ir.addAll(statement.generateIntermediateCode());
        else ir.addAll(codeBlock.generateIntermediateCode());

        //Genera el codigo para aumentar o decrementar en 1
        if(this.forMode==ForMode.TO) {
            ir.add(new Quadruple(IRInstruction.ADD, ac, "1", ac));
        }
        else if(this.forMode==ForMode.DOWNTO) {
            ir.add(new Quadruple(IRInstruction.SUB, ac, "1", ac));
        }

        ir.addAll(goal.generateIntermediateCode());//Reevalua la condicion
        ir.add(new Quadruple(IRInstruction.IF, ir.getLast().getResult(),label,null));//Prueba para la siguiente iteracion
        ir.add(new Quadruple(IRInstruction.ENDL, label));//Fin de etiqueta
        return ir;
    }

    @Override
    public void generateCode(BufferedWriter outputFile) {

    }

    @Override
    public void print(int level) {

    }
}
