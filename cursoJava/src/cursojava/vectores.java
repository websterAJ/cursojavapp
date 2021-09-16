/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

/**
 *
 * @author Alexander torres
 */
public class vectores {
    public static void main(String[] args) {
        String[][] matriz= new String[3][3];
        
        matriz[0][0]="(0,0)";
        matriz[0][1]="(0,1)";
        matriz[0][2]="(0,2)";
        matriz[1][0]="(1,0)";
        matriz[1][1]="(1,1)";
        matriz[1][2]="(1,2)";
        matriz[2][0]="(2,0)";
        matriz[2][1]="(2,1)";
        matriz[2][2]="(2,2)";
        
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}
