package com.example;

import java.io.PrintStream;
import java.util.Scanner;

public class ejercicio4 {

    //Solucion ejercicio 4

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {

        long cantdinero=0;
        long monmil=0;
        long monquinientos=0;
        long mondoscientos=0;
        long moncien=0;
        long monciencuenta=0;
        long monunpeso=0;

        screen.println("Ingresa una cantidad de dinero");
        cantdinero=keyboard.nextLong();
        monmil=(cantdinero/1000);
        monquinientos= (cantdinero % 1000)/500;
        mondoscientos= ((cantdinero % 1000) % 500)/200;
        moncien= (((cantdinero % 1000) % 500 )% 200)/100;
        monciencuenta= ((((cantdinero % 1000) % 500) % 200) %100)/50;
        monunpeso= (((((cantdinero % 1000) % 500) % 200) % 100) % 50);


        screen.println("La cantidad de $"+cantdinero +" pesos"+ " equivalen a:");
        screen.println(monmil+ " moneda(s) de mil");
        screen.println(monquinientos +" moneda(s) de quinientos");
        screen.println(mondoscientos +" moneda(s) de doscientos");
        screen.println(moncien +" moneda(s) de cien");
        screen.println(monciencuenta +" moneda(s) de cincuenta");
        screen.println(monunpeso + " moneda(s) de un peso");      

        
    }
}
    

