/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia;

/**
 *
 * @author Alexander torres
 */
public class ciclos {
    public static void main(String[] args) {
        /**
         * Ciclo o bucle For
         * El bucle for proporciona una forma concisa de escribir la estructura 
         * de bucle. A diferencia de un ciclo while, una sentencia for consume 
         * la inicialización, la condición y el incremento/decremento en una 
         * línea, proporcionando así una estructura de bucle más corta y 
         * fácil de depurar.
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        /**
         * Bucle o ciclo foreach
         * Java también incluye otra versión del bucle for introducido en Java 5.
         * La mejora del bucle for proporciona una forma más sencilla de iterar 
         * a través de los elementos de una colección o matriz. Es inflexible y 
         * debe usarse solo cuando existe la necesidad de recorrer los elementos
         * de forma secuencial sin conocer el índice del elemento procesado actualmente.
         */
        
        String array[] = {"Ron", "Harry", "Hermoine"};
       
        //mejorado para for
        for (String x:array)
        {
            System.out.println(x);
            if(x.equals("Harry")){
                break;
                //continue;
            }
            
        }
        
        
        /**
         * Ciclo o bucle While
         * Un bucle while es una sentencia de control de flujo que permite que 
         * el código se ejecute repetidamente en función de una condición 
         * booleana dada. El bucle while se puede considerar como una 
         * instrucción if repetitiva.
         */
        int x = 1;
 
        // Salir cuando x llega a ser mayor que 4
        while (x <= 4)
        {
            System.out.println("Valor de x: " + x);
 
            //incrementa el valor de x para la siguiente iteración
            x++;
        }
        
        /**
         * Ciclo o bucle do while
         * El bucle do while es similar al while con la única diferencia de que
         * comprueba la condición después de ejecutar las instrucciones, y por 
         * lo tanto es un ejemplo de Exit Control Loop (Salir del bloque de control).
         */
        
        int d = 21;
        do
        {
            //El código dentro del do se imprime incluso
            //si la condición es falsa
            System.out.println("Valor de d :" + d);
            d++;
        }
        while (d < 20);
    }
}
