package parser.ast;

import parser.Quadruple;

import java.util.ArrayList;

public class Program extends AST {
    private String identifier;
    private VarBlock varBlock;
    private ConstBlock constBlock;
    private CodeBlock codeBlock;

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
        return null;
    }

    @Override
    public void generateCode() {

    }
}
