package parser.ast;

import parser.Quadruple;

import java.io.IOException;
import java.util.ArrayList;

public class BreakStatement extends Statement {
    public BreakStatement(){}

    @Override
    public ArrayList<Quadruple> generateIntermediateCode(){
        return null;
    }

    @Override
    public void generateCode(java.io.BufferedWriter outputFile) {
        try{
            outputFile.write("break;");
            outputFile.newLine();
        }catch (IOException ioException){
            throw new RuntimeException(ioException);
        }
    }

    @Override
    public void print(int level) {

    }
}
