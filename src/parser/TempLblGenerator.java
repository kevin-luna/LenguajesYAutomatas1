package parser;

public abstract class TempLblGenerator {
    private static int numberOfInstance;

    public static String getNewInstance(){
        return "l"+Integer.toString(numberOfInstance++);
    }

    public static String getLastInstance(){
        return "l"+Integer.toString(numberOfInstance-1);
    }

    public static int getNumberOfInstance(){
        return numberOfInstance;
    }
}
