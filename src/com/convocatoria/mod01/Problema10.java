package com.convocatoria.mod01;

import java.util.Scanner;

public class Problema10 {
    public static void main(String[] args){
        double catetoA, catetoB, hipotenusa;
        double perimetro,area;
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese el primer cateto: ");
        catetoA = reader.nextDouble();
        System.out.print("Ingrese el segundo cateto: ");
        catetoB = reader.nextDouble();

        area = catetoA*catetoB/2;
        hipotenusa = Math.sqrt(Math.pow(catetoA,2)+Math.pow(catetoB, 2));
        perimetro = catetoA+catetoB+hipotenusa;
        

        System.out.println("El area del triangulo es: "+area);
        System.out.println("La hipotenusa del triangulo rectangulo es: "+hipotenusa);
        System.out.println("El perimetor del triangulo es: "+perimetro);

    }
}
