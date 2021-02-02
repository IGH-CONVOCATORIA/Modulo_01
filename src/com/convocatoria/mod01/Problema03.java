package com.convocatoria.mod01;

import java.util.Scanner;

public class Problema03 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int n,sum;

        System.out.println("Ingrese N: ");
        n=reader.nextInt();

        sum= n*(n+1)/2;

        System.out.println("La suma de los N primeros numeros es: " +sum);


    }
}
