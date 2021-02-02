package com.convocatoria.mod01;

import java.util.Scanner;

public class Problema06 {
    public static void main(String[] args){
        double a,b,c;
        double s,area;
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese los lados del triangulo (a): ");
        a = reader.nextDouble();
        System.out.print("Ingrese los lados del triangulo (b): ");
        b = reader.nextDouble();
        System.out.print("Ingrese los lados del triangulo (c): ");
        c = reader.nextDouble();

        s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("El area del triangulo es: "+area);
        
    }
}
