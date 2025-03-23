package parser;

public class Quadruple {
    private String instruction;
    private String op1,op2;
    private String result;

    public Quadruple(){}

    public Quadruple(String instruction, String op1, String op2, String result) {
        this.instruction = instruction;
        this.op1 = op1;
        this.op2 = op2;
        this.result = result;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
