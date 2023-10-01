package com.example;

import java.io.PrintStream;
import java.util.Scanner;

public class ejercicio3 {

    //Solucion ejercicio 3

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {

        int horasem=0;
        int costohora=0;
        float retefuente=0;
        long salbruto=0;
        long salneto=0;
        long retefuente2=0;

        screen.println("ingrese cantidad de horas trabajadas en la semana");
        horasem=keyboard.nextInt();
        screen.println("Ingrese el valor por hora");
        costohora=keyboard.nextInt();
        screen.println("ingrese la retefuente (en numeros sin el porcentaje)");
        retefuente=keyboard.nextFloat();
        salbruto=horasem*costohora;
        retefuente2= (long) (salbruto*(retefuente/100));
        salneto=salbruto-retefuente2;


        screen.println("El salario bruto es de: "+ salbruto +", el salario neto es de: "+ salneto + " y la refuente es de: "+ retefuente2
        );

        
    }
}
    

