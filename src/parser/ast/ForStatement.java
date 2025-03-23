package parser.ast;

import parser.Quadruple;

import java.util.ArrayList;

public class ForStatement extends Statement{
    private Variable variable;
    private Expression expression1;
    private ForMode forMode;
    private Expression expression2;
    private Statement statement;
    private CodeBlock codeBlock;

    public enum ForMode{
        TO,DOWNTO;
    }

    public ForStatement() {}

    public ForStatement(Variable variable, Expression expression1, ForMode forMode, Expression expression2, Statement statement){
        this.variable = variable;
        this.expression1 = expression1;
        this.forMode = forMode;
        this.expression2 = expression2;
        this.statement = statement;
    }

    public ForStatement(Variable variable, Expression expression1, ForMode forMode, Expression expression2, CodeBlock codeBlock){
        this.variable = variable;
        this.expression1 = expression1;
        this.forMode = forMode;
        this.expression2 = expression2;
        this.codeBlock = codeBlock;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public Expression getExpression1() {
        return expression1;
    }

    public void setExpression1(Expression expression1) {
        this.expression1 = expression1;
    }

    public ForMode getForMode() {
        return forMode;
    }

    public void setForMode(ForMode forMode) {
        this.forMode = forMode;
    }

    public Expression getExpression2() {
        return expression2;
    }

    public void setExpression2(Expression expression2) {
        this.expression2 = expression2;
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
        return null;
    }

    @Override
    public void generateCode() {

    }
}
