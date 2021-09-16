/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Alexander torres
 */
public class Inventario {
    File inventarioFile;
    public Inventario() throws IOException{
        try {
            System.out.println();
            inventarioFile = new File("inventario.txt");
            if (!inventarioFile.exists()) {
                inventarioFile.createNewFile();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public void menu() throws IOException{
        Scanner teclado  = new Scanner(System.in);
        String  pantalla = "";
        Boolean salir    =  false;
        int     Opt;
        pantalla +="**********************************************\n";
        pantalla +="**            Menu de Inventario            **\n";
        pantalla +="**********************************************\n";
        pantalla +="**            1) Ingresar Producto          **\n";
        pantalla +="**            2) Consultar Producto         **\n";
        pantalla +="**            3) Eliminar Producto          **\n";
        pantalla +="**            4) Salir                      **\n";
        pantalla +="**********************************************\n";
        while (salir != true) {
            System.out.println(pantalla);
            Opt=teclado.nextInt();
            switch(Opt){
                case 1:
                    ingresar();
                    break;
                case 2:
                    consultar();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    salir=true;
                    break;
            }
        }
    }
    public void ingresar() throws IOException {
        FileWriter fw = new FileWriter(inventarioFile.getAbsoluteFile(), true);
        BufferedWriter br = new BufferedWriter(fw);
        String  pantalla = "";
        try {
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
           br.close();
           fw.close();
        }
        
    }
    public void consultar() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(inventarioFile);
        BufferedReader br = new BufferedReader(fr);
        String  pantalla = "";
        String Data = br.readLine();
        try {
            while (Data != null) {
                System.out.println(Data);
                Data=br.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            br.close();
            fr.close();
        }
    }
    public void eliminar() throws IOException {
        FileWriter fw = new FileWriter(inventarioFile);
        BufferedWriter br = new BufferedWriter(fw);
        String  pantalla = "";
        try {
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            br.close();
            fw.close();
        }
    }
    public static void main(String[] args) throws IOException {
       Inventario a = new Inventario();
       a.menu();
    }
}
