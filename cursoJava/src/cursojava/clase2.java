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
public class clase2 {
    public static void main(String[] args) {
        /**
         * metodos de declaracion de variables
         * variables declaradas sin inicializar
         */
        String Cadena;
        char caracter;
        long entero_gigante;
        int entero;
        short entero_2byte;
        Double decimal;
        Float decimal2;
        Byte binario;
        Boolean verdadero_o_falso;
        
        /**
         * variables declaradas e inicialidas
         */
        String Cadena1 = "hola como estas";
        char caracter1 = 'i';
        long entero_gigante1= 2^2;
        int entero1=12;
        short entero_2byte1=10;
        Double decimal1 = 12.0;
        Float decimal21 = 0.0f;
        Byte binario1=0;
        Boolean verdadero_o_falso1=false;
        
        /**
         * Declaron de variable utilizando una clase existente
         */
        Scanner lector = new Scanner(System.in);
        /**
         * Declaracion en tiempo de ejecucion
        */
        String dtaLeida = lector.next();
        int numLeido = lector.nextInt();
        int num2Leido = lector.nextInt();
        int resultado = numLeido + num2Leido;
        
        System.out.println("datos ingresados");
        System.out.print("dtaLeida: "+dtaLeida);
        System.out.println("numLeido: "+numLeido);
        System.out.println("num2Leido: "+num2Leido);
        System.out.println("resultado: "+resultado);
        
    }
}
