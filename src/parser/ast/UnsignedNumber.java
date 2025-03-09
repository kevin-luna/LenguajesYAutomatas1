package parser.ast;

import parser.DataType;

public class UnsignedNumber extends UnsignedConstant{

    public UnsignedNumber(){}

    public UnsignedNumber(String value, DataType type) {
        super(value, type);
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateCode() {

    }
}
