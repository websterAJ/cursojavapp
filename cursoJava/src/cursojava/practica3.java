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
public class practica3 {
    int a=0,b=0,c=0,d;
    public static void main(String[] args) {
        practica3 p = new practica3();
        p.getparametros();
        p.operaciones(p.a,p.b);
        System.out.println("Resultado suma: "+  p.c);
        System.out.println("Resultado resta: "+ p.d);
    }
    
    void getparametros(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un valor numerico: ");
        this.a= lector.nextInt();
        System.out.println("Ingrese otro valor numerico: ");
        this.b= lector.nextInt();
    }
    void operaciones(int d,int c){
        this.c = d+c;
        this.d = d-c;
    }
}