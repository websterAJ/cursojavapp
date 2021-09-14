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
public class cadena {
    public static void main(String[] args) {
        /*
        Una cadena en Java es en realidad un objeto, que contiene métodos que 
        pueden realizar ciertas operaciones en cadenas. Por ejemplo, la longitud
        de una cadena se puede encontrar con el length()método
        */
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("La longitud de la cadena txt es: " + txt.length());
        
        //Hay muchos métodos de cadena disponibles, por ejemplo toUpperCase()y toLowerCase(): 
        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // Salida "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Salida "hello world"
        
        /**
         * La indexOf()método devuelve el índice (la posición) de la primera 
         * aparición de un texto especificado en una cadena 
         * (incluidos los espacios en blanco): 
         */
        String txt3 = "Por favor, localice el lugar donde se produce la 'localización'.";
        System.out.println(txt3.indexOf("localización"));
        
        /**
         * concatenacion
         * La + El operador se puede utilizar entre cadenas para combinarlos. Esto se llama concatenación 
         */
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        
        /**
         * También puede utilizar el concat()método para concatenar dos cadenas: 
         */
        String firstName2 = "John ";
        String lastName2 = "Doe";
        System.out.println(firstName2.concat(lastName2));
        
        /*
        \' 	' 	Comillas simples
        \" 	" 	Comillas dobles
        \\ 	\ 	Barra invertida
        */
        String txt4 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt4);
        
        /*
        \n 	Nueva línea 	
        \r 	Retorno de carro 	
        \t 	Tabulador 	
        \b 	Retroceso 	
        \f 	Alimentación de formularios
        */
    }
}
