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
public class practica7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String valor = lector.next();
        
        if("eber".equals(valor)){
            System.out.println("hola eber");
        }
        if(valor.equals("eber")){
            System.out.println("Tambien funciona");
        }
        valor = "eber";
        if(valor == "eber"){
            System.out.println("Tambien funciona");
        }
    }
}
