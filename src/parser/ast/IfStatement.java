package parser.ast;

import parser.IRInstruction;
import parser.Quadruple;
import parser.TempLblGenerator;

import java.util.ArrayList;

public class IfStatement extends Statement{

    private Expression condition;
    private Statement statement;
    private CodeBlock block;
    private ElseStatement elseStatement;

    public IfStatement(){}

    public IfStatement(Expression condition, Statement statement){
        this.condition = condition;
        this.statement = statement;
    }

    public IfStatement(Expression condition, Statement statement, ElseStatement elseStatement){
        this.condition = condition;
        this.statement = statement;
        this.elseStatement = elseStatement;
    }

    public IfStatement(Expression condition, CodeBlock block){
        this.condition = condition;
        this.block = block;
    }

    public IfStatement(Expression condition, CodeBlock block, ElseStatement elseStatement){
        this.condition = condition;
        this.block = block;
        this.elseStatement = elseStatement;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public CodeBlock getCodeBlock() {
        return block;
    }

    public void setBlock(CodeBlock block) {
        this.block = block;
    }

    public ElseStatement getElseStatement() {
        return elseStatement;
    }

    public void setElseStatement(ElseStatement elseStatement) {
        this.elseStatement = elseStatement;
    }

    @Override
    public void traverse() {

    }

    @Override
    public ArrayList<Quadruple> generateIntermediateCode() {
        ArrayList<Quadruple> ir = condition.generateIntermediateCode();
        ir.add(new Quadruple(IRInstruction.IF, ir.getLast().getResult(), TempLblGenerator.getLastInstance(),null));
        ir.add(new Quadruple(IRInstruction.LBL,TempLblGenerator.getNewInstance()));
        if(statement!=null) ir.addAll(statement.generateIntermediateCode());
        else ir.addAll(block.generateIntermediateCode());
        ir.add(new Quadruple(IRInstruction.ENDL,TempLblGenerator.getLastInstance()));
        if(elseStatement!=null) ir.addAll(elseStatement.generateIntermediateCode());
        return ir;
    }

    @Override
    public void generateCode() {

    }
}
