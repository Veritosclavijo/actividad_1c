
import java.io.PrintStream;
import java.util.Scanner;

public class ejercicio5 {

    //Solucion ejercicio 5

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        long cantpesos= 0;
        long cantdolares=0;
        long canteuros=0;

        screen.println("ingrese cantidad de dinero en pesos colombianos ");
        cantpesos=keyboard.nextLong();
        cantdolares=cantpesos*4077;
        canteuros=cantpesos*4310;

        screen.println(cantpesos+ " Equivalen a "+ cantdolares+ " dólares y a "+ canteuros+ " euros");
        

             

        
    }
}