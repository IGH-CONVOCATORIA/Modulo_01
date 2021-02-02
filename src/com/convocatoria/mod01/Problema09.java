package com.convocatoria.mod01;

import java.util.Scanner;

public class Problema09 {
    public static void main(String[] args){
        double distancia,velocidad,tiempo;
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese la distancia de A entre B (KM): ");
        distancia = reader.nextDouble();
        System.out.print("Ingrese la velocidad del auto (KM/H): ");
        velocidad = reader.nextDouble();

        tiempo = distancia/velocidad ; 

        System.out.println("El tiempo que se demora un auto ,con una velocidad de "+velocidad+" KM/H ,recorrer la distacian de A entre B es : "+tiempo+" horas");
    }
}
