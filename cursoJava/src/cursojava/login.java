/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alexander torres
 */
public class login {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String usuario = "alexander";

        String pass = "123456";

        boolean datosLoginEncontrados = false;

        BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"));
        String linea = reader.readLine();

        while (linea != null && datosLoginEncontrados == false){
            //En linea tenemos nombre y password juntos, separados por dos guiones.
            //Usamos split() para que "corte" el String a partir de esos dos guiones
            //Esto nos dará un array con dos elementos, el primer elemento contendrá el nombre y el segundo el password
            String[] datosLogin = linea.split("--");
            //YA tenemos los datos separados, comprobamos si coinciden
            if (datosLogin[0].equals(usuario) && datosLogin[1].equals(pass))
                datosLoginEncontrados = true;//Al pasar a true, el bucle while finalizará
            else
                linea = reader.readLine();
            
        }
        if(datosLoginEncontrados){
            System.out.println("Bienvenido");
        }else{
            System.out.println("No esta registrado");
        }
    }
    
}
