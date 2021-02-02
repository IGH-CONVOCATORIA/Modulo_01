package com.convocatoria.mod01;

import java.util.Scanner;

public class Problema01 {
    public static void main(String[] arg){
        int a,b;
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese a: ");
        a = reader.nextInt();
        System.out.print("Ingree b: ");
        b = reader.nextInt();     

        int suma= a+b;
        int resta= a-b;
        int multi= a*b;
        int div = a/b;

         System.out.println("La suma es: "+suma);
         System.out.println("La resta es: "+resta);
         System.out.println("La multi es: "+multi);         
         System.out.println("La div es: "+div);

    }
}
