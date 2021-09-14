/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import java.util.Scanner;

public class practica4 {
     
    public static void main(String[] args){
       int a, b;
       a = Entrada();
       b = Entrada();
       
       Suma(a,b);
       Resta(a,b);
       Multiplicacion(a,b);
       Division(a,b);
       
    }
     // metodo para ingresar valor dentro del sistema.
    
    public static int Entrada(){
        System.out.println("ingrese un número: ");
        Scanner Entrada = new Scanner (System.in);
        return Entrada.nextInt();
        
    }
    
    //La Suma y las demas operaciones se pueden realizar en una misma funcion ó metodo.
    
    public static void Suma(int a, int b){
        int c;
        
        c = a+b;
        System.out.println("La suma de los numeros ingresados es : " + c);
        
    }
    
    public static void Resta (int a, int b){
        int c;
        
        
        c = a-b;
        System.out.println("La resta de los numeros ingresados es : " + c);
    }
    
     public static void Multiplicacion (int a, int b){
        int c;
        
        c = a*b;
        System.out.println("La multiplicacion de los numeros ingresados es : " + c);
        
     }
        
     public static void Division (int a, int b){
        int c;
        
        c = a/b;
        System.out.println("La division de los numeros ingresados es : " + c); 
        
     }
        
    
}
