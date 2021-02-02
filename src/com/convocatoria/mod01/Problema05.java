package com.convocatoria.mod01;

import java.util.Scanner;

public class Problema05 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        double precio,importe,impuesto,ventaT;
        int cantidad;

        System.out.print("Ingrese el precio del producto: ");
        precio = reader.nextFloat();

        System.out.print("Ingrese la cantidad: ");
        cantidad = reader.nextInt();

        ventaT = precio*cantidad;
        importe = (ventaT/1.18);
        impuesto = ventaT-importe;


        System.out.println("El importe de la venta es: "+importe);
        System.out.println("El impuesto de ley es: "+impuesto);
        System.out.println("La venta total es: "+ventaT);    


    }
}
