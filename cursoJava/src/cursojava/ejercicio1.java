package cursojava;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Double a,b,c;
        Double[] r = new Double[3];
        Double x1,x2,d;
        int i=0;
     
        /*while(i < 3){
            System.out.println("ingrese el "+ (i+1) +" coeficiente");
            r[i]=lector.nextDouble();
            i++;
        }*/
        do{
            System.out.println("ingrese el "+ (i+1) +" coeficiente");
            r[i]=lector.nextDouble();
            i++;
        }while(i < 3);
        
        d=((r[1]*r[1])-4*r[0]*r[2]);
        if(d<0){
            System.out.println("no existen soluciones reales");
        }else{
            System.out.println("Solucion real: " + d);
        }
    }
    
}
