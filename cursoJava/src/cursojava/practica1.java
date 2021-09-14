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
public class practica1 {

    public static void main(String[] args) {
        pideData();     
        
    }
    public static void pideData(){
        int a=0,b=0;
        Scanner ent= new Scanner(System.in);        
        System.out.println("Ingrese el su primer valor");
        a=ent.nextInt();
        System.out.println("Ingrese su segundo valor");
        b=ent.nextInt(); 
        calcula(a,b);
    }
    public static void calcula(int a, int b){
        int r=0;
        r=a+b;
        System.out.println("Operacion suma "+ r);
        r=a-b;
        System.out.println("Operacion resta "+ r);
        r=a*b;
        System.out.println("Operacion multiplicacion "+r);
        r=a/b;
        System.out.println("Operacion division "+r);
    }
 
    
}
