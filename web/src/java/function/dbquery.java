/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import config.Connectdb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ALEXA
 */
public class dbquery extends Connectdb{
   // public selectAll(String campos,String tabla){}
   public String[] selectWhere(String campos,String tabla,String where) throws SQLException{
       String[] response = null;
       Statement s = getCon().createStatement();
       ResultSet rs = s.executeQuery ("select "+campos+" from "+tabla+" where "+where);
       int total = campos.split(",").length;
       int contador = 0;
        while (rs.next()) {
            System.out.println(rs.first());
        }
       return response;
   }
   // public UpdateData(String campos,String tabla,String where){}
   // public DeleteData(String campos,String tabla,String where){}
   // public InsertData(list data,String tabla){}
}
