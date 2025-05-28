import parser.*;
import parser.ast.Program;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Map;


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
            Program program = parser.Program();
            if(parser.thereAreErrors()){
                parser.printErrors();
            }else{
                System.out.println("No se encontraron errores");
//                parser.printUsages();
//                System.out.println("Generando el codigo intermedio...");
//                ArrayList<Quadruple> ir = program.generateIntermediateCode();
//                for(Quadruple q: ir){
//                    System.out.println(q);
//                }
                File inputFile = new File(ruta);
                String inputFilename = inputFile.getName().substring(0, inputFile.getName().lastIndexOf('.'));
                File tmpFile = new File(inputFile.getParent() + "\\tmp.cpp");
                BufferedWriter tmpCFileBuffer = new BufferedWriter(new FileWriter(tmpFile));
                program.generateCode(tmpCFileBuffer);
//                ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c",
//                        "C:\\Program Files\\Microsoft Visual Studio\\2022\\Community\\VC\\Tools\\MSVC\\14.44.35207\\bin\\Hostx64\\x64\\cl.exe",
//                        "/FA",
//                        "/Fe:",
//                        inputFilename+".exe",
//                        inputFile.getParent()+"\\tmp.cpp"
//                );
//                Map<String, String> env = pb.environment();
//                env.put("INCLUDE", "C:\\Program Files\\Microsoft Visual Studio\\2022\\Community\\VC\\Tools\\MSVC\\14.44.35207\\include;" +
//                        "C:\\Program Files\\Microsoft Visual Studio\\2022\\Community\\VC\\Tools\\MSVC\\14.44.35207\\atlmfc\\include;" +
//                        "C:\\Program Files\\Microsoft Visual Studio\\2022\\Community\\VC\\Auxiliary\\VS\\include;" +
//                        "C:\\Program Files (x86)\\Windows Kits\\10\\Include\\10.0.26100.0\\ucrt;" +
//                        "C:\\Program Files (x86)\\Windows Kits\\10\\Include\\10.0.26100.0\\um;" +
//                        "C:\\Program Files (x86)\\Windows Kits\\10\\Include\\10.0.26100.0\\shared;" +
//                        "C:\\Program Files (x86)\\Windows Kits\\10\\Include\\10.0.26100.0\\winrt;" +
//                        "C:\\Program Files (x86)\\Windows Kits\\10\\Include\\10.0.26100.0\\cppwinrt");
//                env.put("LIB",     "C:\\Program Files\\Microsoft Visual Studio\\2022\\Community\\VC\\Tools\\MSVC\\14.44.35207\\lib");
//                env.put("PATH",    env.get("PATH") + "C:\\Program Files\\Microsoft Visual Studio\\2022\\Community\\VC\\Tools\\MSVC\\14.44.35207\\bin");
                tmpCFileBuffer.close();
                ProcessBuilder generateAssemblyCode = new ProcessBuilder("C:\\cygwin64\\bin\\g++.exe","-S","-o",inputFile.getParent()+"\\"+inputFilename+".s", tmpFile.toString() );
                generateAssemblyCode.inheritIO();
                generateAssemblyCode.start().waitFor();

                ProcessBuilder generateExe = new ProcessBuilder("C:\\cygwin64\\bin\\g++.exe","-O2","-o",inputFile.getParent()+"\\"+inputFilename+".exe", tmpFile.toString() );
                generateExe.inheritIO();
                generateExe.start().waitFor();
                tmpFile.delete();
            }
        }catch(ParseException e){
            //System.out.println("Error: " + e.getMessage());
            System.out.println("Hubo errores Sintacticos");
        //    e.printStackTrace();
        }catch(FileNotFoundException e){
            System.out.println("No se encontró el archivo: " + e.getMessage());
        }catch (TokenMgrError e){
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("No se pudo escribir el archivo de salida");
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("Ocurrio un error al compilar el archivo.");
        }

    }
}