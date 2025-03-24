package parser;

public class Quadruple {
    private IRInstruction instruction;
    private String op1,op2;
    private String result;

    public Quadruple(){}

    public Quadruple(IRInstruction instruction,String result){
        this.instruction = instruction;
        this.result = result;
    }

    public Quadruple(IRInstruction instruction, String op1, String op2, String result) {
        this.instruction = instruction;
        this.op1 = op1;
        this.op2 = op2;
        this.result = result;
    }

    public IRInstruction getInstruction() {
        return instruction;
    }

    public void setInstruction(IRInstruction instruction) {
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
