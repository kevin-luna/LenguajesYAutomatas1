package parser;

public abstract class TempVarGenerator {
    private static int numberOfInstance;

    public static String getNewInstance() {
        return "t"+Integer.toString(numberOfInstance++);
    }

    public static String getLastInstance(){
        return "l"+Integer.toString(numberOfInstance-1);
    }

    public static int getNumberOfInstance() {
        return numberOfInstance;
    }

}
