import org.antlr.v4.runtime.*;
import java.io.*;

public class Main {
	
	private static void cambiarSalida(String nombre) {
        PrintStream ps = null;
        try {
        	
        	String nombreNew = nombre.replace(".pas", ".c");
            System.out.print("Salida en: " + nombreNew);
            ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(nombreNew, true)), true);
            new PrintWriter(nombreNew).close();
            System.setOut(ps);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

	
    public static void main(String[] args) {
        try{
        	
        	if (args.length < 1) {
                System.err.println("Por favor, proporciona un archivo de entrada.");
                return;
            }
// Preparar el fichero de entrada para asignarlo al analizador léxico
            CharStream Pascal_To_C_input = CharStreams.fromFileName(args[0]);
// Crear el objeto correspondiente al analizador léxico con el fichero de entrada
            PascalLikeLexer analex = new PascalLikeLexer(Pascal_To_C_input);
// Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(analex);
// Crear el objeto correspondiente al analizador sintáctico
            PascalLikeParser parser = new PascalLikeParser(tokens);

            cambiarSalida(args[0]);
            
            parser.programa();
            
        } catch (org.antlr.v4.runtime.RecognitionException e) {
//Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
//Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
//Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }
    }
}


