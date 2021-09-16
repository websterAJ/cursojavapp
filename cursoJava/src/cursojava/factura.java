/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;  

/**
 *
 * @author ppago0020
 */
public class factura {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        Double item[] = new Double[100];
        String prod[] = new String[100];

        char otro;
        int i = 0;

        System.out.print("Ingrese Su Cedula: ");
        String cedula = Scan.nextLine();

        System.out.print("Ingrese Su Nombre: ");
        String nombre = Scan.nextLine();

        //System.out.print("Agregar Otro Articulo(S/N): ");
        //otro = Scan.nextLine(); 
        do {

            System.out.print("Articulo: ");
            prod[i] = Scan.next();
            System.out.print("Precio: ");
            item[i] = Scan.nextDouble();
            i++;

            //System.out.println("");
            System.out.print("Agregar Otro Articulo(S/N): ");
            otro = Scan.next().charAt(0);

        } while (otro == 'S' || otro == 's');

        Double suma = 0.0;
        System.out.println("***********************************");
	System.out.println("***********FACTURA 0001************");
	System.out.println("***********************************");
        System.out.println("|Nombre: " + nombre + "\n" + "|Cédula: " + cedula);
        System.out.println("***********************************");
        System.out.println("|ITEM------------------------MONTO|");
        for (int j = 0; j < i; j++) {
            System.out.println(prod[j] + "---------------------" + item[j]);
            suma += item[j];           
        }

        System.out.println("***********************************");
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("*SUBTOTAL: " + df.format(suma / 1.16));
        System.out.println("*IVA (16): " + df.format(suma - (suma / 1.16)));
        System.out.println("*TOTAL: " + df.format(suma));
        System.out.println("*Gracias por su compra");
	System.out.println("***********************************");
    }

}
