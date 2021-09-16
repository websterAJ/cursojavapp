/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alexander torres
 */
public class socketServer extends ConexionServer {
    //Se usa el constructor para servidor de Conexion
    public socketServer() throws IOException{
        super("servidor");
    } 
    //Método para iniciar el servidor
    public void startServer(){
        try
        {
            while(true){
               
                System.out.println("===              Esperando...                 ===");//Esperando conexión
                System.out.println("=================================================");
                cs = ss.accept(); //Accept comienza el socket y espera una conexión desde un cliente
                System.out.println("Cliente en línea");
                //Se obtiene el flujo de salida del cliente para enviarle mensajes
                salidaCliente = new DataOutputStream(cs.getOutputStream());

                //Se le envía un mensaje al cliente usando su flujo de salida
                salidaCliente.writeUTF("Petición recibida y aceptada");

                //Se obtiene el flujo entrante desde el cliente
                BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));
                //Mientras haya mensajes desde el cliente
                while((mensajeServidor = entrada.readLine()) != null) 
                {
                    //Se muestra por pantalla el mensaje recibido
                    System.out.println(mensajeServidor);
                }
                System.out.println("Fin de la conexión");
                cs.close();
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
        
        //Se crea el servidor
        socketServer serv = new socketServer();
        System.out.println("=================================================");
        System.out.println("===              Iniciando servidor           ===");
        System.out.println("=================================================");
        //Se inicia el servidor
        serv.startServer();
    }
}
