/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ALEXA
 */
public class socketClient extends socket{
    private BufferedReader in;
    public socketClient() throws IOException{
        super("cliente");
    }
    
    public String sendMessage(String message){
        try
        {
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());
            // Se envia el mensaje
            salidaServidor.writeUTF(message);
            in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            String resp = null;
            resp = in.readLine();
            //Fin de la conexión
            cs.close();
            return resp;
            
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
