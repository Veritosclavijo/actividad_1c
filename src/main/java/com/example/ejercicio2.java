import java.io.PrintStream;
import java.util.Scanner;

public class ejercicio2 {

    //Solucion ejercicio 2

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {

        long numcelular=0;
        int prefijo=0;

        screen.println("ingrese un número celular");
        numcelular=keyboard.nextLong();
        prefijo= (int) (numcelular/10000000);
        
        screen.println("El prefijo del número de celular ingresado es: " + prefijo);
        
    }
}