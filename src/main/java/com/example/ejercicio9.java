import java.io.PrintStream;
import java.util.Scanner;

public class ejercicio9 {

    // solucion ejercicio 9

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {

        float dist=0;
        float tiempo=0;
        float velocidad=0;

        screen.println("Ingresar la distancia entre los dos puntos en metros ");
        dist=keyboard.nextFloat();
        screen.println("ingresar tiempo en segundos que tarda en llegar del punto 1 al punto 2");
        tiempo=keyboard.nextFloat();
        velocidad=dist/tiempo;

        screen.println("Se recorre la distancia de "+ dist+ " metros en "+ tiempo+" segundos, a una velocidad de "+ velocidad +"ms");




        

    }
    
}