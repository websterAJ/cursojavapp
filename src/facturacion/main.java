/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavapp.facturacion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author daltuve
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);
        String pantalla = "";

        boolean salir = false;
        int opcion_salir;
        int opcion;

        do {

            pantalla += "**********************************************\n";
            pantalla += "*   Bienvenido al Programa de Facturación    *\n";
            pantalla += "**********************************************\n";
            pantalla += "**  (1) Facturación                          **\n";
            pantalla += "**  (2) Cierre                               **\n";
            pantalla += "**  (3) Reportes                             **\n";
            pantalla += "**  (4) Inventario                           **\n";
            pantalla += "**  (5) Salir                                **\n";
            pantalla += "**********************************************\n";

            try {
                System.out.println(pantalla);

                System.out.println("Por favor ingresa una de las opciones 1-5");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Estas en la opcion 1. == Facturación ==");
                        System.out.println("\f");
                        break;
                    case 2:
                        System.out.println("Estas en la opcion 2. == Cierre ==");
                        System.out.println("\f");
                        break;
                    case 3:
                        System.out.println("Estas en la opcion 3. == Reportes ==");
                        System.out.println("\f");
                        break;
                    case 4:
                        System.out.println("Estas en la opcion 4. == Inventario ==");
                        System.out.println("\f");
                        break;
                    case 5:
                        System.out.println("¿Desea salir del programa? si/no");
                        System.out.println("Presione [1] para salir: ");
                        System.out.print("Presione [2] para continuar: ");
                        opcion_salir = entrada.nextInt();
                        salir = opcion_salir == 1;
                        break;

                    default:
                        System.err.println("Solo números entre 1 y 5. Intenta de nuevo");
                }

            } catch (InputMismatchException e) {
                System.err.println("Debes Insertar un número válido entre las opciones 1 - 5");
                entrada.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("\f");
                System.out.println("Fin del programa de Facturación");
            }

        } while (salir != true);
    }
}
