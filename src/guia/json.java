/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia;

import org.json.*;
/**
 *
 * @author Alexander torres
 */
public class json {
    public static void main(String[] args) {
        JSONObject myObject = new JSONObject();

        // Cadenas de texto básicas
        myObject.put("name", "Carlos");
        myObject.put("last_name", "Carlos");
        
        // Valores primitivos
        myObject.put("age", new Integer(21));
        myObject.put("bank_account_balance", new Double(20.2));
        myObject.put("is_developer", true);
        
        // Matrices
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        myObject.put("number_list", myList);
        
        // Objeto dentro de objeto
        JSONObject subdata = new JSONObject();
        myObject.put("extra_data", subdata);

        // Generar cadena de texto JSON
        System.out.println(myObject);
        
        System.out.println(myObject.get("name"));
    }
}
