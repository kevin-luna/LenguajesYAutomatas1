package parser.ast;

import parser.IRInstruction;
import parser.Quadruple;
import parser.TempLblGenerator;

import java.util.ArrayList;

public class WhileStatement extends Statement{
    private Expression expr;
    private Statement statement;
    private CodeBlock codeBlock;

    public WhileStatement(){}

    public WhileStatement(Expression expr, Statement statement){
        this.expr = expr;
        this.statement = statement;
    }

    public WhileStatement(Expression expr, CodeBlock codeBlock){
        this.expr = expr;
        this.codeBlock = codeBlock;
    }

    public Expression getExpr() {
        return expr;
    }

    public void setExpr(Expression expr) {
        this.expr = expr;
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
        ir.addAll(expr.generateIntermediateCode());//Evalua la expresion condicional y almacena el resultado en una variable temporal
        ir.add(new Quadruple(IRInstruction.IF, ir.getLast().getResult(),TempLblGenerator.getNewInstance(),null));
        ir.add(new Quadruple(IRInstruction.LBL, TempLblGenerator.getLastInstance()));//Inicio de etiqueta

        //Genera codigo que se ejecutara dentro del IF
        if(statement!=null)ir.addAll(statement.generateIntermediateCode());
        else ir.addAll(codeBlock.generateIntermediateCode());

        ir.addAll(expr.generateIntermediateCode());//Se reevalua la condicion
        ir.add(new Quadruple(IRInstruction.IF, ir.getLast().getResult(),TempLblGenerator.getLastInstance(),null));//Prueba para la siguiente iteracion
        ir.add(new Quadruple(IRInstruction.ENDL, TempLblGenerator.getLastInstance()));//Fin de etiqueta
        return ir;
    }

    @Override
    public void generateCode() {

    }

    @Override
    public void print(int level) {
        System.out.println("WHILE_STATEMENT");
    }
}
