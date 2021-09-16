/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import java.util.Scanner;

public class Practica2 {
    public static int getparametros(){
        System.out.println("Ingrese un valor numerico: ");
        Scanner lector = new Scanner(System.in);
        return lector.nextInt();
    }
    public static void operacion(int a, int b){
        int c = a+b;
        System.out.println("Resultado: " +c);
    }
    public static void main(String[] args) {
        int a=0,b=0;
        a=getparametros();
        b=getparametros();
        operacion(a,b);
    }
}

    

