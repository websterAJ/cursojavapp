/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia;

import java.io.*;

/**
 *
 * @author Alexander torres
 */
public class archivos {
    String  fileName;
    String cadena;
    File input;
    public archivos(String fileName) throws FileNotFoundException, IOException{
        this.fileName=fileName;
        input = new File(fileName);
        if(!input.exists()){
            input.createNewFile();
        }
    }
    public String leer() throws IOException{
       
        try{
            FileReader fr= new FileReader(input);
            BufferedReader b = new BufferedReader(fr);
            while((cadena = b.readLine())!=null) {
                return cadena;
            }
            b.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public void escribir(String datos) throws IOException{
       
        try{
            FileWriter fw = new FileWriter(input.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(datos);
            bw.newLine();
            bw.close();
            fw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
        archivos file = new archivos("prueba.txt");
        file.escribir("cama"); 
        file.leer();
    }
}
