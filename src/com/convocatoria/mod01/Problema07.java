package com.convocatoria.mod01;

import java.util.Scanner;

public class Problema07 {

    public static void main(String[] args){
        double numeroH,pagoxH;
        double ingresoT,sueldoN;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Ingrese numero de horas trabajadas: ");
        numeroH = reader.nextDouble();
        System.out.print("Ingrese pago por hora: ");
        pagoxH = reader.nextDouble();

        ingresoT = numeroH*pagoxH;
        sueldoN = ingresoT*0.95;

        System.out.println("El sueldo neto a pagar de un trabajador es: "+sueldoN);
    }
    
}
