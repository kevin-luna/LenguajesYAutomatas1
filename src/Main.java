import java.io.*;
import java.io.FileInputStream;
import parser.*;
public class Main {

    public static void main(String[] args)  {
        if (args.length == 0) {
            System.out.println("Debe proporcionarse una ruta de archivo");
            System.out.println(args[0]);
            System.exit(0);
        }
        try{
            String ruta = args[0];
            PascalParser pascalParser = new PascalParser(new PascalParserTokenManager(new SimpleCharStream(new FileInputStream(ruta))));
            pascalParser.Program();
            System.out.println("No se encontraron errores de sintaxis");
        }catch(ParseException e){
            System.out.println("Error: " + e.getMessage());
        }catch(FileNotFoundException e){
            System.out.println("No se encontró el archivo: " + e.getMessage());
        }catch (TokenMgrError e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}