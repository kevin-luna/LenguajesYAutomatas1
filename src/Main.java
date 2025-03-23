import parser.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Main {

    public static void main(String[] args)  {
        if (args.length == 0) {
            System.out.println("Debe proporcionarse una ruta de archivo");
            System.exit(0);
        }
        String ruta = args[0];
        PascalParser parser = null;
        try{
            parser = new PascalParser(new PascalParserTokenManager(new SimpleCharStream(new FileInputStream(ruta))));
            parser.Program();
            System.out.println("No se encontraron errores de sintaxis");
        }catch(ParseException e){
            System.out.println("Error: " + e.getMessage());
            //e.printStackTrace();
        }catch(FileNotFoundException e){
            System.out.println("No se encontró el archivo: " + e.getMessage());
        }catch (TokenMgrError e){
            System.out.println("Error: " + e.getMessage());
        }
        if(parser!=null){
            parser.printErrors();
        }
    }
}