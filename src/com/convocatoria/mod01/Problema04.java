package com.convocatoria.mod01;

import java.util.Scanner;

public class Problema04 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int a,b,c,media;

        System.out.print("Ingrese a: ");
        a=reader.nextInt();
        System.out.print("Ingrese b: ");
        b=reader.nextInt();
        System.out.print("Ingrese c: ");
        c=reader.nextInt();

        media= (a+b+c)/3;

        System.out.println("El promedio media de los 3 numeros es: " +media);


    }
}
