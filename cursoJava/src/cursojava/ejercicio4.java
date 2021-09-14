/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import guia.archivos;
import guia.entrada;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Alexander torres
 */
class empleado{
    private String Nombre;
    private String apellido;
    private int edad;
    private double salario;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public empleado(String Nombre, String apellido, int edad, double salario) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
    public empleado(){}
    
    
}
public class ejercicio4 {
   
    public static void main(String[] args) throws IOException {
        String Nombre;
        String Apellido;
        int Edad;
        double Salario;
        DataOutputStream salidaServidor;
        archivos file = new archivos("ejercicio4.txt"); 
        System.out.println("Ingrese los datos de los empleados a registrar");
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el nombre del empleado n° "+ (i+1));
            Nombre = entrada.cadena();
            System.out.println("Ingrese el apellido del empleado n° "+ (i+1));
            Apellido = entrada.cadena();
            System.out.println("Ingrese la edad del empleado n° "+ (i+1));
            Edad = entrada.entero();
            System.out.println("Ingrese el salario del empleado n° "+ (i+1));
            Salario = entrada.entero();
            String dataguardar = Nombre +"||"+Apellido+"||"+Edad+"||"+Salario;
            System.out.println(dataguardar);
            file.escribir(dataguardar);
        }
        Socket cliente = new Socket("localhost",8888);
        salidaServidor = new DataOutputStream(cliente.getOutputStream());
        //Se enviarán dos mensajes
        for (int i = 0; i < 2; i++)
        {
            //Se escribe en el servidor usando su flujo de datos
            salidaServidor.writeUTF(file.leer()+ "\n");
        }
        //Fin de la conexión
        cliente.close();
    }
    
}
