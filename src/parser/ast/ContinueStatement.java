package parser.ast;

import parser.Quadruple;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ContinueStatement extends Statement {
    public ContinueStatement(){}

    @Override
    public ArrayList<Quadruple> generateIntermediateCode(){
        return null;
    }

    @Override
    public void generateCode(BufferedWriter outputFile){
        try{
            outputFile.write("continue;");
            outputFile.newLine();
        }catch (IOException ioException){
            throw new RuntimeException(ioException);
        }
    }

    @Override
    public void print(int level) {

    }
}
