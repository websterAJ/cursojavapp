/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia;

import java.util.Calendar;

/**
 *
 * @author Alexander torres
 */
public class condicionales {
    public static void ejecutar(){
        System.out.println("Condicion cumplida");
    }
    public static void main(String[] args) {
        /**
         * Estructura IF
         * 
         * La estructura condicional más simple en Java es el if, se evalúa una 
         * condición y en caso de que se cumpla se ejecuta el contenido entre 
         * las llaves {} o en caso de que se omitan se ejecuta el código hasta 
         * el primer «;» por lo tanto si no se usan los {} la condición aplica 
         * solo a la siguiente instrucción al if.
        **/
        if (9>10) {
            ejecutar();
        }

        // Los {} son opcionales
        if (8<10)
            ejecutar();

        // Y mas compacto
        if (9==9) ejecutar();
        
        /**
         * Estructura IF ELSE
         * 
         * Con el if solo podemos hacer que se ejecute un fragmento de código o no
         * pero en el caso de que no se cumpla la condición no se hace nada
         * (sigue el flujo normal de ejecución) por lo que si queremos que se 
         * ejecute otra cosa cuando no se cumpla la condición solo con el if 
         * tenemos que hacer otro con la condición inversa provocando que se 
         * tenga que comprobar la condición 2 veces mientras que si usamos el else
         * solo necesitamos hacer la comprobación una sola vez.
         */
        int temperatura = 20;
        // Usando solo ifs
        if (temperatura > 25) {
            System.out.println("A la playa!!!");
        }

        if (temperatura <= 25) {
            System.out.println("Esperando al buen tiempo...");
        }

        // Usando if con else
        // Si la temperatura es mayor que 25 ... y si no ...
        if (temperatura > 25) {
            System.out.println("A la playa!!!");
        } else {
            System.out.println("Esperando al buen tiempo...");
        }
        
        /**
         * Estructura IF ELSE IF
         * El siguiente nivel es hacer el else condicional añadiendo un if para
         * que si no se cumple la primera condición (la del if principal) se 
         * evalue esta nueva condición de modo que se puede concatenar la 
         * cantidad de if else que se necesiten para cubrir todos los distintos
         * escenarios que precisen ser tratados de una forma particular, siendo 
         * el ultimo else el que se ejecute cuando no se cumpla ninguna 
         * condición (el else es siempre opcional).
         */
        Boolean nevando=false;
        if (temperatura > 25) {
            // Si la temperatura es mayor que 25 ...
            System.out.println("A la playa!!!");
        } else if (temperatura > 15) {
            // si es mayor que 15 y no es mayor que 25 ..
            System.out.println("A la montaña!!!");
        } else if (temperatura < 5 && nevando) {
            // si es menor que 5 y esta nevando y no es mayor que 15 ni mayor que 25
            System.out.println("A esquiar!!!");
        } else {
            // si la tempera  no es mayor que 25 ni que 15 ni menor que 5 si esta nevando
            System.out.println("A descansar... zZz");
        }
        
        /**
         * If anidados
         * Es posible anidar ifs para reorganizar las condiciones o hacerlas más
         * sencillas lo que en muchas ocasiones hace el código más fácil de leer,
         * a continuación una de las posibles formas posibles para reescribir 
         * el ejemplo anterior.
         */
        
        if (temperatura > 15) {
            if (temperatura > 25) {
                // Si la temperatura es mayor que 25 ...
                System.out.println("A la playa!!!");
            } else {
                System.out.println("A la montaña!!!");
            }
        } else if (temperatura < 5) {
            if (nevando) {
                System.out.println("A esquiar!!!");
            }
        } else {
            System.out.println("A descansar... zZz");
        }
        
        /**
         * El operador ternario ?
         * En ocasiones un if se utiliza simplemente para obtener un valor u 
         * otro en función de si una se cumple una condición o no, en estos 
         * casos se puede sustituir la estructura if else por el operador 
         * ternario u operador condicional que tiene la sintaxis 
         * resultado = condicion ? valor_si_se_cumple : valor_si_no_se_cumple 
         * los valores tanto para el caso de que se cumpla como para el que no 
         * pueden ser valores directamente como un texto o un entero o llamadas 
         * a funciones que devuelvan un objeto del tipo esperado.
         */
        
        // Ejemplo 1
        String queHacer = (temperatura > 25) ? "A la playa!!!" : "Esperando al buen tiempo...";

        // Ejemplo 2
        double numero = (temperatura > 10) ? (Math.random() * 10) : 0;
        
        /**
         * Estructura condicional switch
         * Con el switch se puede hacer un control del tipo if else if… más 
         * estructurado pero en realidad no exactamente igual puesto que con 
         * el switch lo que se hace es definir un conjunto de casos que van a 
         * tener una ejecución distinta y se ejecutará el caso que coincida con 
         * el valor indicado en el switch.
         */
        int variable = 1;
        switch (variable) {
            case 1:
            case 2:
                // Ejecutar si el valor de variable es igual a valor_1 o a valor_2
                System.out.println("variable es igual a 1 o a 2");
                break; // Salir del switch
            case 3:
                // Ejecutar si el valor de variable es igual a valor_3
                System.out.println("el valor de variable es igual a 3");
                break; // Salir del switch
            default:
                // Ejecutar si el valor de varible es distinto del del resto de casos
                System.out.println("el valor de varible es distinto del del resto de casos");
                break; // Salir del switch
        }
        
        // Switch con int como condicion
        Integer dia = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            // default: es opcional
        }

        // Switch con String como condicion
        String tipoVehiculo = "coche";
        switch (tipoVehiculo) {
            case "coche":
                System.out.println("Puedes pasar de 00:00 a 08:00");
                break;
            case "camion":
                System.out.println("Puedes pasar de 08:00 a 16:00");
                break;
            case "moto":
                System.out.println("Puedes pasar de 16:00 a 24:00");
                break;
            default:
                System.out.println("No se puede pasar con un " + tipoVehiculo);
                break;
        }
    }
}
