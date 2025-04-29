package parser;

import parser.ast.*;

public class SemanticAnalyzer {
    private SymbolTable symbolTable;
    private SemanticStack semanticStack;
    private ErrorLog errorLog;

    public SemanticAnalyzer(SymbolTable symbolTable, ErrorLog errorLog) {

    }

    public SemanticAnalyzer(SymbolTable symbolTable, SemanticStack semanticStack, ErrorLog errorLog) {
        this.symbolTable = symbolTable;
        this.semanticStack = semanticStack;
        this.errorLog = errorLog;
    }

    public boolean checkVariableRedefinition(SymbolEntry symbol){
        return checkSymbolRedefinition(symbol);
    }

    public boolean checkArrayRedefinition(SymbolEntry symbol){
        if(symbolTable.getSymbol(symbol.getName()) != null){
            if(symbolTable.getSymbolType(symbol.getName()) != SymbolType.ARRAY){
                errorLog.logSemanticError(symbol.getDefLine(),symbol.getName()+" ya existe y no es un arreglo");
                return true;
            }
            errorLog.logSemanticError(symbol.getDefLine(),"Redefinicion del arreglo "+symbol.getName());
            return true;
        }

        return false;
    }

    public boolean checkConstantRedefinition(SymbolEntry symbol){
        return checkSymbolRedefinition(symbol);
    }

    public boolean checkConstReassignment(String name){
        if(symbolTable.lookSymbol(name)){
            SymbolEntry symbol = symbolTable.getSymbol(name);
            SymbolType symbolType = symbolTable.getSymbolType(name);
            if(symbol.getType()!= null && symbol.getType()== SymbolType.CONSTANT){
                errorLog.logSemanticError(symbol.getDefLine(),"Redefinicion de constante "+symbol.getName());
                return true;
            }
        }
        return false;
    }

    public boolean checkConstant(DataType dataType,String sign,int line){
        if(sign!=null && (dataType==DataType.REAL || dataType== DataType.INTEGER)){
            return true;
        }
        errorLog.logSemanticError(line,"No se puede aplicar el signo "+sign+" a un tipo "+dataType);
        return false;
    }

    public boolean checkSymbolExists(String name,int refLine){
        if(!symbolTable.lookSymbol(name)){
            errorLog.logSemanticError(refLine,"Referencia a símbolo indefinido "+name);
            return false;
        }
        return true;
    }

    public boolean checkSymbolIsNumeric(String name,int refLine){
        if(!symbolTable.lookSymbol(name)){
            DataType dt = symbolTable.getSymbol(name).getDataType();
            return dt==DataType.INTEGER || dt==DataType.REAL;
        }
        return false;
    }

    public boolean checkArray(String name,Expression expr,int refLine){
        if(!symbolTable.lookSymbol(name)){
            if(isArray(name)){
                if(expr.getReturnType()==DataType.INTEGER){
                    return true;
                }else{
                    errorLog.logSemanticError(refLine,"El indice del arreglo "+name+" debe ser un entero");
                }
            }else{
                errorLog.logSemanticError(refLine,"El simbolo "+name+" no es un arreglo");
            }
        }else{
            errorLog.logSemanticError(refLine,"El simbolo "+name+" no esta definido");
        }
        return false;
    }

    public boolean isConstant(String name){
        SymbolEntry symbol = symbolTable.getSymbol(name);
        if(symbol!=null && symbol.getType()== SymbolType.CONSTANT)return true;
        return false;
    }

    public boolean isVariable(String name){
        SymbolEntry symbol = symbolTable.getSymbol(name);
        if(symbol!=null && symbol.getType()== SymbolType.VARIABLE)return true;
        return false;
    }

    public boolean isArray(String name){
        SymbolEntry symbol = symbolTable.getSymbol(name);
        if(symbol!=null && symbol.getType()== SymbolType.ARRAY)return true;
        return false;
    }

    public boolean checkExpression(SimpleExpression expr1, SimpleExpression expr2, int line){
        if(expr1 == null || expr2 == null){
            return false;
        }
        if(expr1.getReturnType() == expr2.getReturnType()){
            return true;
        }
        errorLog.logSemanticError(
                line,
                "No se puede comparar un tipo "
                +expr1.getReturnType()
                +" con un tipo "
                +expr2.getReturnType()
        );
        return false;
    }

    public boolean factorIsBoolean(Factor factor){
        return (factor.getReturnType()==DataType.BOOLEAN);
    }

    public boolean factorIsNumeric(Factor factor){
        return (factor.getReturnType()==DataType.INTEGER || factor.getReturnType()==DataType.REAL);
    }

    public boolean termIsBoolean(Term term){
        return term.getReturnType()==DataType.BOOLEAN;
    }

    public boolean termIsNumeric(Term term){
        return term.getReturnType()==DataType.INTEGER || term.getReturnType()==DataType.REAL;
    }

    public boolean termIsString(Term term){
        return term.getReturnType()==DataType.STRING;
    }

    public boolean checkFactorConsistency(Factor f1,Factor f2,String operator,int line){
        operator=operator.toLowerCase();
        if(operator=="and"){
            return (f1.getReturnType()==DataType.BOOLEAN && f2.getReturnType()==DataType.BOOLEAN);
        }
        if(operator=="*" || operator=="div" || operator=="/" || operator=="mod")
            return (f1.getReturnType()==DataType.INTEGER || f1.getReturnType()==DataType.REAL)
                    && (f2.getReturnType()==DataType.INTEGER && f2.getReturnType()==DataType.REAL);
        errorLog.logSemanticError(line,"Inconsistencia de tipos "+f1.getReturnType().toString()+" "+operator+" "+f2.getReturnType().toString());
        return false;
    }

    public boolean checkInsideLoop(){
        return semanticStack.lookBlock(BlockType.WHILE_BLOCK) || semanticStack.lookBlock(BlockType.FOR_BLOCK);
    }

    public boolean checkDivisionByZero(Term left,Term right, String sign, int line){
        return false;
    }

    public boolean checkAssignment(Variable variable,Expression expression){
        return variable.getDataType()==expression.getReturnType();
    }

    private boolean checkSymbolRedefinition(SymbolEntry symbol){
        String name = symbol.getName();
        int defLine = symbol.getDefLine();
        String msg;
        switch (symbol.getType()){
            case SymbolType.VARIABLE -> msg = "la variable ";
            case SymbolType.CONSTANT -> msg = "la constante ";
            case SymbolType.ARRAY -> msg = "el arreglo ";
            default -> msg = "al simbolo ";
        }
        if(symbolTable.lookSymbol(name)){
            errorLog.logSemanticError(defLine,"Redeclaracion de "+msg+name);
            return true;
        }else{
            symbolTable.addSymbol(symbol);
        }
        return false;
    }
}
