package parser.ast;

import java.sql.SQLOutput;

public class Utils {
    public static void printNTimes(int n,char c){
        for(int i=1;i<=n;i++){
            System.out.print(c);
        }
    }

    public static void printBranch(boolean condition,int level){
        if(condition){
            printLastBranch(level);
        }else
            printIntermediateBranch(level);
    }

    public static void printIntermediateBranch(int level){
        for(int i=1;i<level;i++){
            System.out.print('│');
        }
        System.out.print("├");
    }

    public static void printLastBranch(int level){
        for(int i=1;i<level;i++){
             System.out.print('│');
        }
        System.out.print("└");
    }
}
