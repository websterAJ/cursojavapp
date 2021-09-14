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
public class Vector {
    public void vectores(){
        Scanner opt= new Scanner(System.in);
        System.out.println("Ingrese el tipo de array:");
        System.out.println("1) vector");
        System.out.println("2) matriz");
        switch (opt.nextInt()) {
            case 1:
                System.out.println("Ingrese la longitud del vector");
                int a =opt.nextInt();
                int vct[] = new int[a];
                for (int i = 0; i < vct.length; i++) {
                    System.out.println("Ingrese el valor de la posicion "+ i);
                    vct[i]=opt.nextInt();
                }
                for (int i = 0; i < vct.length; i++) {
                    System.out.println(vct[i]);
                }
                break;
            case 2:
                System.out.println("Ingrese la primera longitud de la matriz");
                int b =opt.nextInt();
                System.out.println("Ingrese la segunda longitud de la matriz");
                int c =opt.nextInt();
                int matz[][] = new int[b][c];
                for (int i = 0; i < matz.length; i++) {
                    for (int j = 0; j < matz.length; j++) {
                        System.out.println("Ingrese el valor de la posicion "+ (i+1) +" "+ (j+1));
                        matz[i][j]=opt.nextInt();
                    }
                }
                for (int k = 0; k < matz.length; k++) {
                    for (int y = 0; y < matz.length; y++) {
                        System.out.print(matz[k][y]+" ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Opcion no permitida");
                break;
        }
    }
}
