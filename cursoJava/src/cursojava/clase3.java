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
public class clase3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor1;
        int valor2;
        
        System.out.println("Ingrese el valor numero 1");
        valor1=entrada.nextInt();
        System.out.println("Ingrese el valor numero 2");
         valor2=entrada.nextInt();
        /**
         * estructura condicional
         */
        if(valor1 > valor2){
            System.out.println("el numero"+valor1+" es mayor que "+valor2);
        }else{
            System.out.println("el numero"+valor2+" es mayor que "+valor1);
        }
    }
}
