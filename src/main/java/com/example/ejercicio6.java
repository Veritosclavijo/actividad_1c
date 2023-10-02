import java.io.PrintStream;
import java.util.Scanner;

public class ejercicio6 {

    // solucion ejercicio 6

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {

        long segundos=0;
        long minutos=0;
        long horas=0;
        long dias=0;
        long segundos2=0;

        screen.println("Ingrese cantidad de tiempo en segundos");
        segundos=keyboard.nextLong();
        dias=segundos/86400;
        horas=(segundos%86400)/3600;            
        minutos=((segundos%86400)%3600)/60;
        segundos2=(((segundos%86400)%3600)%60);


       screen.println(segundos + " segundos equivalen a " + dias+ " dias(s), a "+ horas+" hora(s), a "+ minutos+ " minutos y a "+ segundos2+ " segundos");


    }
    
}
