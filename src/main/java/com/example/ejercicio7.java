import java.io.PrintStream;
import java.util.Scanner;

public class ejercicio7 {

    // solucion ejercicio 7

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {

        float largo=0;
        float ancho=0;
        float alto=0;
        float litros=0;

        screen.println("Ingrese el largo en cm");
        largo=keyboard.nextFloat();
        screen.println("Ingrese el ancho en cm");
        ancho=keyboard.nextFloat();
        screen.println("Ingrese el alto en cm");
        alto=keyboard.nextFloat();
        litros= (float) ((float) ((largo*ancho*alto)/1000)*0.9);

        screen.println("De acuerdo a las medidas ingresadas, es necesario "+ litros+" litros de agua para llenar el acuario a una capacidad del 90%");




        

    }
    
}

