package parser;

import java.util.ArrayList;

public class ErrorLog
{
    private ArrayList<ErrorEntry> errorList;

    public ErrorLog(){
        this.errorList = new ArrayList<>();
    }

    public void logLexicalError(int line, String description){
        this.errorList.add(new ErrorEntry(ErrorType.LEXICAL_ERROR,line,description));
    }

    public void logSyntaxError(int line, String description){
        this.errorList.add(new ErrorEntry(ErrorType.SYNTAX_ERROR,line,description));
    }

    public void logSemanticError(int line, String description){
        this.errorList.add(new ErrorEntry(ErrorType.SEMANTIC_ERROR,line,description));
    }

    public void printLog(){
        for(ErrorEntry entry: this.errorList){
            System.out.println(entry);
        }
    }
}
