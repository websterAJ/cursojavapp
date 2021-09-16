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
public class menu {
    Scanner lector = new Scanner(System.in);
    public menu(int a) throws IOException{
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        System.out.println("****            BIENVENIDOS                  ****");
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        System.out.println("****          1)  OPCION 1                   ****");
        System.out.println("****          2)  OPCION 2                   ****");
        System.out.println("****          3)  OPCION 3                   ****");
        System.out.println("****          4)  Salir                      ****");
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        int opt=lector.nextInt();
        System.out.print("\033[H\033[2J");  
System.out.flush();  
        switch (opt) {
            case 1:
                metodo1(a);
                break;
            case 2:
                metodo2();
                break;
            case 3:
                metodo3();
                break;
            case 4:
                break;
            default:
                System.out.println("Opcion no permitida");
                break;
        }
    }
    public void metodo1(int a) throws IOException{
        System.out.println("metodo 1 "+ a);
        menu back = new menu(1);
    }
    public void metodo2() throws IOException{
        System.out.println("metodo 2");
        menu back = new menu(2);
    }
    public void metodo3() throws IOException{
        System.out.println("metodo 3");
        menu back = new menu(3);
    }
}
