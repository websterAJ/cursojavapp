/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ALEXA
 */
public class Connectdb {
    private final String db   = "bd_cursojava";
    private final String user = "root";
    private final String pass = "root";
    private final String host = "192.168.45.4";
    private final int port    = 3306;
    private Connection Con    = null;
    
    public Connection getCon(){
        return Con;
    }
    /**
     * 
     * @return
     * @throws SQLException 
     */
    public Connection StartConnect() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Conectamos con la base de datos
            Con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db,user, pass);
            return Con;
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al registrar el driver de MySQL: " + ex);
        }
        return null;
    }
    /**
     * 
     * @return 
     */
    public Connection StopConnect(){
        return Con = null;
    }
}
