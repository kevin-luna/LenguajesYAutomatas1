package parser.ast;

import parser.DataType;
import parser.Quadruple;

import java.util.ArrayList;

public class UnsignedNumber extends UnsignedConstant{

    public UnsignedNumber(){}

    public UnsignedNumber(String value, DataType type) {
        super(value, type);
    }

    @Override
    public void traverse() {

    }

    public ArrayList<Quadruple> generateIntermediateCode() {
        return null;
    }

    @Override
    public void generateCode() {

    }
}
