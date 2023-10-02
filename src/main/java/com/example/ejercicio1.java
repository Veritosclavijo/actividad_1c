import java.io.PrintStream;
import java.util.Scanner;

public class ejercicio1 {

    //Esta la solucion del ejercicio 1

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        int numero=0;
        int resultado=0;

        screen.println("ingrese un número");
        numero=keyboard.nextInt();

        resultado=numero%2;

        screen.println("El residuo de dividir " + numero + " entre 2 es: "+ resultado);




    }
}
