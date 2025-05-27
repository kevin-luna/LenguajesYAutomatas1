package parser.ast;

import parser.Quadruple;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CodeBlock extends Block{
    private ArrayList<Statement> statements;

    public CodeBlock() {}

    public CodeBlock(ArrayList<Statement> statements) {
        super(BlockType.CODE_BLOCK);
        this.statements = statements;
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public ArrayList<Quadruple> generateIntermediateCode(){
        ArrayList<Quadruple> ir = new ArrayList<>();
        for(Statement s : statements){
            ArrayList<Quadruple> tmp = s.generateIntermediateCode();
            if(tmp!=null)ir.addAll(tmp);
        }
        return ir;
    }

    public void setStatements(ArrayList<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public void generateCode(BufferedWriter outputFile){
        try {
            outputFile.write("{");
            outputFile.newLine();
            for(Statement s: statements ){
                s.generateCode(outputFile);
            }
            outputFile.newLine();
            outputFile.write("}");
            outputFile.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void print(int level) {
        Utils.printLastBranch(level);
        System.out.println("CODE_BLOCK");
        for(int i=0; i<statements.size(); i++){
            Utils.printBranch(i==statements.size()-1,level+1);
            statements.get(i).print(level+1);
        }
    }
}
