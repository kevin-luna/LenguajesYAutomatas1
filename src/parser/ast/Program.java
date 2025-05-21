package parser.ast;

import parser.IRInstruction;
import parser.Quadruple;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Program extends AST {
    private String identifier;
    private VarBlock varBlock;
    private ConstBlock constBlock;
    private CodeBlock codeBlock;

    public Program() {}

    public Program(String identifier, VarBlock varBlock, ConstBlock constBlock, CodeBlock codeBlock) {
        this.identifier = identifier;
        this.varBlock = varBlock;
        this.constBlock = constBlock;
        this.codeBlock = codeBlock;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public VarBlock getVarBlock() {
        return varBlock;
    }

    public void setVarBlock(VarBlock varBlock) {
        this.varBlock = varBlock;
    }

    public ConstBlock getConstBlock() {
        return constBlock;
    }

    public void setConstBlock(ConstBlock constBlock) {
        this.constBlock = constBlock;
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
        ArrayList<Quadruple> intermediateCode = new ArrayList<>();
        intermediateCode.add(new Quadruple(IRInstruction.PGRM,this.identifier));
        if(constBlock!=null)intermediateCode.addAll(constBlock.generateIntermediateCode());
        if(varBlock!=null)intermediateCode.addAll(varBlock.generateIntermediateCode());
        intermediateCode.addAll(codeBlock.generateIntermediateCode());
        //Optimizaciones de mirilla
        for(Quadruple q : intermediateCode){
            if(q.getInstruction()==IRInstruction.DIV && q.getOp2().equals("2")){
                q.setInstruction(IRInstruction.RSF);
                q.setOp2("1");
            }else if(q.getInstruction()==IRInstruction.MUL && q.getOp1().equals("2")){
                q.setInstruction(IRInstruction.LSF);
                q.setOp1("1");
            }
        }

        return intermediateCode;
    }

    @Override
    public void generateCode() {

    }

    @Override
    public void print(int level) {
        System.out.println("PROGRAM");
        Utils.printBranch(false,level);
        System.out.println(identifier);
        if(constBlock!=null)constBlock.print(level+1);
        if(varBlock!=null) varBlock.print(level+1);;
        if(codeBlock!=null) codeBlock.print(level+1);
    }
}
