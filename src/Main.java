import java.io.*;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static String [][] estudiantes;

    // Rutina principal del programa
    public static void main(String[] args) throws IOException {
        inicializarMatriz();
        imprimirMatriz();
    }

    // rutina para leer la opcion elegida
    static int leerOpciones() throws IOException {
        System.out.println("Por favor, seleccoine una opción");
        int opciones = Integer.parseInt(in.readLine());
        return opciones;
    }

    // impresion del texto que recibe como parametro
    static void imprimirTexto(String msj) {
        out.println(msj);
    }

    // lectura de informacion ingresada por el usuario
    static String leerTexto() throws IOException {
        return in.readLine();
    }

    static void inicializarMatriz() throws IOException {
        imprimirTexto("Digite la cantidad de estudianes");
        int size = Integer.parseInt(leerTexto());
        estudiantes = new String[3][size];
    }

    static void registrarEstudiante(String nombre, String apellidos, String cedula) {
        estudiantes[0][0] = nombre;
        estudiantes[1][0] = apellidos;
        estudiantes[2][0] = cedula;
    }
    static void imprimirMatriz() {
        for (int fila = 0; fila<estudiantes.length; fila++) {
            for (int col = 0; col<estudiantes[fila].length; col++) {
                imprimirTexto( " "+ estudiantes[fila][col]);
            }
            imprimirTexto(" ");
        }
    }
}
