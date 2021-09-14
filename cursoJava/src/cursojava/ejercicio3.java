/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alexander torres
 */
public class ejercicio3 {
    public static void main(String[] args) throws IOException {
        Scanner lector = new Scanner(System.in);
        Archivos file = new Archivos("ejercicio3.txt");
        Vector v = new Vector();
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        System.out.println("****            BIENVENIDOS                  ****");
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        System.out.println("****          1)  ESCRIBIR EN EL FICHERO     ****");
        System.out.println("****          2)  LEER EN EL FICHERO         ****");
        System.out.println("****          3)  TRABAJAR CON VECTORES      ****");
        System.out.println("****          4)  Salir                      ****");
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        int opt=lector.nextInt(); 
        switch (opt) {
            case 1:
                file.escribir();
                break;
            case 2:
                file.leer();
                break;
            case 3:
                v.vectores();
                break;
            case 4:
                break;
            default:
                System.out.println("Opcion no permitida");
                break;
        }
    }
}
