/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import guia.entrada;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alexander torres
 */
public class Archivos {
    String  fileName;
    String cadena;
    File input;
    public Archivos(String fileName) throws FileNotFoundException, IOException{
        this.fileName=fileName;
        input = new File(fileName);
        if(!input.exists()){
            input.createNewFile();
        }
    }
    public void leer() throws IOException{
       
        try{
            FileReader fr= new FileReader(input);
            BufferedReader b = new BufferedReader(fr);
            while((cadena = b.readLine())!=null) {
                System.out.println(cadena);
            }
            b.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void escribir() throws IOException{
        System.out.println("Ingrese los datos a guardar en el archivo: ");
        String datos = entrada.cadena();
        boolean cont=false;
        
        try{
            FileWriter fw = new FileWriter(input.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(datos);
            bw.newLine();
            System.out.println("Desea ingresar mas datos en el archvio(S/N)");
            char opt = entrada.caracter();
            bw.close();
            fw.close();
            if(opt=='s' || opt=='S'){
                escribir();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
