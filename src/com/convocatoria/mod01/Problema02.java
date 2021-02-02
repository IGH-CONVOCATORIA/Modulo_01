package com.convocatoria.mod01;

import java.util.Scanner;

public class Problema02 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        double rd;
        double area = 0;
        String x;

        System.out.print("Ingresara radio(R) o diametro(D)? : ");
        x=reader.next().toUpperCase();
        System.out.print("Ingrese la variable: ");
        rd = reader.nextDouble();

        switch(x){
            case "R":
                area = Math.PI*rd*rd;
                break;
            case "D":
                area = Math.PI*rd*rd/4;
                break;
            default:
                break;
        }

        System.out.println("El area del circulo es :" + area);


    }   
}
