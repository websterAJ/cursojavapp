/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


/**
 *
 * @author Alexander torres
 */
public class socket {
    private DataOutputStream salidaServidor,salidaCliente;
    private Socket cs;
    //Se usa el constructor para cliente de Conexion
    public socket() throws IOException{cs = new Socket("10.227.155.49", 8888);}
    //Método para iniciar el cliente
    public void startClient() 
    {
        try
        {
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());
            //Se enviarán dos mensajes
            /*for (int i = 0; i < 2; i++)
            {
                //Se escribe en el servidor usando su flujo de datos
                salidaServidor.writeUTF("Este es el mensaje número " + (i+1) + "\n");
            }*/
            salidaServidor.writeUTF("{\"number_list\":[1.9,2.9,3.4,3.5],\"extra_data\":{},\"name\":\"Carlos\",\"last_name\":\"Carlos\",\"bank_account_balance\":20.2,\"age\":21,\"is_developer\":true}");
            //Fin de la conexión
            cs.close();
        }
        catch (IOException e){System.out.println(e.getMessage());}
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        //Se crea el cliente
        socket cli = new socket();
        System.out.println("Iniciando cliente\n");
        //Se inicia el cliente
        cli.startClient();
    }
}
