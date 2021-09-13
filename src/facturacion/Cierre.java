/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

/**
 *
 * @author fernando
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

   /**
    * ******Notas:
    * Falta ver archivo de inventario para conocer si los datos llegan en array, matriz o cualquier otra forma 
    * para asi determinar la manera de tratar los datos.
    * (Usando ciclos for y las coordenadas de los array/matrices para tratar separar el string y usar las posiciones)
    * ************
    */

public class Cierre {
    
    /**
    * Funcion readfile: para leer un archivo y mostrar su contenido. Se usa FileNotFoundException e IOException 
    * en caso de que exista un error (excepciones). Se usan librerias FileReader y BufferedReader.  
    * 
    */
    public static void readfile(String file) throws FileNotFoundException, IOException {
        String content;                                     //Contenido del archivo en string
        FileReader fread = new FileReader(file);            //FileReader de nombre fread con parametro file (file es el archivo a leer)
        BufferedReader bread = new BufferedReader(fread);   //BufferedReader de nombre bread con el FileReader como parametro         
        FileWriter result = null;                           //FileWriter con variable para creacion de Cierre.txt
        PrintWriter pwriter = null;                         //PrintWriter con variable para impresion de texto en Cierre.txt

        System.out.println("Se leyo un archivo correctamente. Consultar archivo Cierre.txt generado por el sistema. ");
           // while((content = bread.readLine())!=null) { //Mientras el contenido no sea null, es decir, que exista
                try{                                            //Generamos el fichero con los resultados
                    content = bread.readLine();
                    result = new FileWriter("Cierre.txt");      //Nombramos al archivo
                    pwriter = new PrintWriter(result);          //Le pasamos como parametro el FileWriter result (archivo Cierre.txt)
                    pwriter.println("Prueba de impresion de texto en archivo");
                    pwriter.println("Texto sacado de archivo inicial: ");
                    pwriter.println("====================================================================");
                    pwriter.println("   " + content);
                    pwriter.println("====================================================================");

                } catch (Exception e) {
                    System.out.println("Error en el Exception (linea 47)");
                } finally {                                     //En el finally cerramos el Archivo y el lector de archivo.
                    if (result != null) {
                        result.close();
                    }else{
                        System.out.println("Error en cierre de result (linea 50)");
                    }
                    if (fread != null) {
                         fread.close();
                    }else{
                        System.out.println("Error en cierre de lector (linea 55)");
                    }    
                }
           // }
           // bread.close();                                      //Cierre del bread
        }
     /**
    * Metodo main: ejecuta el llamado al metodo readfile.
    * El parametro que le pasas debe ser la direccion de donde tienes el archivo
    */
    public static void main(String[] args) throws IOException {
        readfile("/home/fernando/Escritorio/Prueba_cierre.txt"); 
    }
   
}


