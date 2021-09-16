package cursojava;

import java.util.Scanner;
import java.util.Arrays;


/**
 *
 * @author ppago0020
 */
public class datosA {
    
    
    public static void main(String[] args) {
        
        int pide [] = pideData();
        calcula(pide[0], pide[1]);
        
    }
     public static int[] pideData(){
       int a,b;
        
        Scanner ent= new Scanner(System.in);
               
        System.out.println("Ingrese su primer valor: ");
        a=ent.nextInt();
        System.out.println("Ingrese su segundo valor: ");
        b=ent.nextInt();
        return new int[] {a, b};
    }
      
   public static void calcula(int a, int b){
        
        int r;
        
        r=a+b;
        System.out.println("Operación suma: " + r);
        r=a-b;
        System.out.println("Operación resta: " + r);
        r=a*b;
        System.out.println("Operación multiplicación: " + r);
        r=a/b;
        System.out.println("Operación división: " + r);
    }
   
    
}
