/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import java.util.Scanner;

/**
 *
 * @author Alexander torres
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,r;
        String apellido;
        
        System.out.println("Introduce el radio del circulo");
        r=entrada.nextDouble();
        a=Math.PI*(r*r);
        System.out.println("El área de una circunferencia de radio " + r+ " es: " + a);
    }
}
