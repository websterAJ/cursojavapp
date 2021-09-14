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
public class vectores_matrices {
    public static void main(String[] args) {
        /*
        Las matrices se utilizan para almacenar varios valores en una sola variable,
        en lugar de declarar variables independientes para cada valor.
        Para declarar una matriz, defina el tipo de variable entre corchetes 
        */
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        String[] vector1= new String[50];
        int[] vector2= new int[50];
        /**
        Puede acceder a un elemento de matriz consultando el número de índice.
        Esta declaración accede al valor del primer elemento en automóviles: 
        */
        System.out.println(cars[0]);
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        
        /* 
        Para cambiar el valor de un elemento específico, consulte el número de índice: 
        */
        cars[0] = "Opel";
        System.out.println(cars[0]);
        /*
        Para averiguar cuántos elementos tiene una matriz, use el lengthpropiedad: 
        */
        System.out.println(cars.length);
        /*
        Puede recorrer los elementos de la matriz con el forbucle, 
        y use el length propiedad para especificar cuántas veces debe ejecutarse el bucle.
        El siguiente ejemplo muestra todos los elementos de los coches. formación: 
        */
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        // for-Each
        for (String i : cars) {
            System.out.println(i);
        }
        
        /*
        Matrices multidimensionales
        
        Una matriz multidimensional es una matriz que contiene una o más matrices.
        Para crear una matriz bidimensional, agregue cada matriz dentro de su propio conjunto de llaves : 
        */
        int[][] myNumbers = {
            {1, 2, 3},
            {5, 6, 7}
        };
        int x = myNumbers[1][2];
        System.out.println(x);
        
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
              System.out.println(myNumbers[i][j]);
            }
        }
    }
}
