package parser.ast;

import parser.*;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReadlnCall extends ReadCall{

    public ReadlnCall(){}

    public ReadlnCall(ArrayList<Variable> variables) {
        super(variables);
    }

    @Override
    public void traverse() {

    }

    @Override
    public ArrayList<Quadruple> generateIntermediateCode() {
        ArrayList<Quadruple> ir = new ArrayList<>();
        IRInstruction ins = null;
        for(Variable var : variables){
            switch (var.getDataType()){
                case DataType.INTEGER -> {
                    ins = IRInstruction.RI;
                    break;
                }
                case DataType.REAL -> {
                    ins = IRInstruction.RR;
                    break;
                }
                case DataType.CHAR -> {
                    ins = IRInstruction.RC;
                    break;
                }
                case DataType.BOOLEAN -> {
                    ins = IRInstruction.RB;
                    break;
                }
                case DataType.STRING -> {
                    ins = IRInstruction.RS;
                    break;
                }
            }
            ir.add(new Quadruple(ins,var.getName()));
            ir.add(new Quadruple(IRInstruction.LBL,TempLblGenerator.getNewInstance()));
            ir.add(new Quadruple(IRInstruction.RC,TempVarGenerator.getNewInstance()));
            ir.add(new Quadruple(IRInstruction.EQ,ir.getLast().getResult(),"\\n", TempVarGenerator.getNewInstance()));
            ir.add(new Quadruple(IRInstruction.IF,ir.getLast().getResult(),TempLblGenerator.getLastInstance(), null));
            ir.add(new Quadruple(IRInstruction.ENDL,TempLblGenerator.getLastInstance()));
        }

        return null;
    }

    @Override
    public void generateCode(BufferedWriter outputFile) {
        try{
            outputFile.write("cin>>");
            outputFile.write(variables.get(0).getName());
            for(int i=1; i<variables.size(); i++){
                outputFile.write(">>");
                outputFile.write(variables.get(i).getName());
            }
            outputFile.write(";");
            outputFile.write("std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\\n');\n");
            outputFile.newLine();
        }catch (IOException ioException){
            throw new RuntimeException(ioException);
        }
    }

    @Override
    public void print(int level) {

    }
}
