/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.socket;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author ALEXA
 */
public class socketClient extends socket{
    public socketClient() throws IOException{
        super("cliente");
    }
    
    public void sendMessage(String message){
        try
        {
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());
            // Se envia el mensaje
            salidaServidor.writeUTF(message);
            //Fin de la conexión
            cs.close();
        }
        catch (IOException e){System.out.println(e.getMessage());}
        
    }
}
