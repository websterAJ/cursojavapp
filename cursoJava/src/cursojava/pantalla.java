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
public class pantalla {
    public static void main(String[] args) {
        
        operaciones p = new operaciones();
        Scanner lector = new Scanner(System.in);
       
        System.out.println("Ingrese el primer valor");
        int a = lector.nextInt();
        System.out.println("Ingrese el segundo valor");
        int b = lector.nextInt();
        
        System.out.println("Resultado suma: "+ p.suma(a, b));
        System.out.println("Resultado resta: "+ p.resta(a, b));
        System.out.println("Resultado multiplicacion: "+ p.multiplicacion(a, b));
        System.out.println("Resultado Division: "+ p.division(a, b));  
    }   
}
