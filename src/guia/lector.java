/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia;

import java.util.Scanner;

/**
 *
 * @author Alexander torres
 */

/**
 * clase con los metodos de entradas de datos mas utilizados
 * @author Alexander torres
 */
public class lector {
    Scanner entrada;
    
    public lector(){entrada = new Scanner(System.in);}
    
    public int entero(){ return entrada.nextInt();}
    public double decimal(){ return entrada.nextDouble();}
    public String cadena(){ return entrada.next();}
    public float decimalGrande(){ return entrada.nextFloat();}
    public byte byt(){ return entrada.nextByte();}
    public long enteroGigante(){return entrada.nextLong();}
    
}
