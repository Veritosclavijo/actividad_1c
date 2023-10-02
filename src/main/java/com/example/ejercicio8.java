import java.io.PrintStream;
import java.util.Scanner;

public class ejercicio8 {

    // solucion ejercicio 8

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {

        double ancho=0;
        double alto=0;
        double diagonal=0;
        double pulgadas=0;


        screen.println("ingrese en cm el ancho del televisor");
        ancho=keyboard.nextDouble();
        screen.println("Ingrese en cm el alto del televisor");
        alto=keyboard.nextDouble();
        diagonal=(Math.pow(alto, 2))+(Math.pow(ancho,2));
        pulgadas=(Math.sqrt(diagonal))/2.54;

        screen.println("De acuerdo al ancho y alto ingresado, la longitud del televisor equivale a:"+ Math.round(pulgadas)+ " pulgadas");    





        

    }
    
}