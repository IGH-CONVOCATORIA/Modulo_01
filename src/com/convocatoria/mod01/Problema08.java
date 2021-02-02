package com.convocatoria.mod01;

import java.util.Scanner;

public class Problema08 {

    public static void  main(String[] args){
        int numeroE;
        double costoxE,importe;
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese el numero de estudiantes: ");
        numeroE = reader.nextInt();
        System.out.print("Ingrese el costo por estudiante: ");
        costoxE = reader.nextDouble();

        importe = numeroE*costoxE;

        System.out.println("El importe total que pagaria una promocion es : "+importe);
    }
}
