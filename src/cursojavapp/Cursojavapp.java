/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavapp;

import java.util.Scanner;
import facturacion.*;
/**
 *
 * @author ALEXA
 */
public class Cursojavapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opt;
        String pantalla = "";
        pantalla += "====================================================\n";
        pantalla += "==       Bienvenido a cursojava de puropago       ==\n";
        pantalla += "====================================================\n";
        pantalla += "== Seleccione una opcion :                        ==\n";
        pantalla += "== 1) Sistema de facturacion                      ==\n";
        pantalla += "====================================================\n";
        pantalla += "== opcion :";
        System.out.print(pantalla);
        opt = teclado.nextInt();
        
        switch(opt){
            case 1:
                //facturacion.main();
                break;
        }
    }
    
}
