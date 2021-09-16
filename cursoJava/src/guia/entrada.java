/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia;

import java.io.*;

/**
 *
 * @author Alexander torres
 */
public class entrada {
    /**
     * LOS InputStream: EL OBJETO System.in
     * 
     * Al igual que Java nos ofrece System.out para escribir en pantalla, 
     * tenemos System.in para leer de ella. System.in es un objeto de una 
     * clase de java que se llama InputStream.
     * Para java, un InputStream es cualquier cosa de la que se leen bytes.
     * Puede ser el teclado, un fichero, un socket, o cualquier otro dispositivo de entrada.
     * Esto, por un lado es una ventaja. Si todas esas cosas son InputStream,
     * podemos hacer código que lea de ellas sin saber qué estamos leyendo.
     * Por otro lado, es una pega. Como un InputStream es para leer bytes,
     * sólo tiene métodos para leer bytes. Nosotros queremos leer palabras
     * o números del teclado, no bytes. Si escribimos en el teclado una A 
     * mayúscula y la leemos con System.in, obtendremos un entero de valor 65,
     * que es el valor del byte correspondiente a la A.
     */
    
    /**
     * LOS Reader
     * 
     * Para java, una clase Reader es una clase que lee caracteres.
     * Esto se parece más a lo que queremos. Un Reader tiene métodos para leer caracteres.
     * Con esta clase ya podriamos trabajar. La pena es que seguimos teniendo System.in,
     * que es un InputStream y no un Reader.
     */
    
    /**
     * LA CLASE BufferedReader
     * 
     * Con la clase InputStreamReader podríamos apañarnos.
     * La pega es que nos da los caracteres sueltos. Si estamos leyendo de teclado,
     * el que usa el programa puede escribir 10 caracteres o 20 o 13. 
     * Si usamos InputStreamReader, como lee caracteres sueltos, 
     * Tenemos que decirle cuántos queremos (que no lo sabemos), o bien ir pidiendo
     * de uno en uno hasta que no haya más.Esto es un poco rollo y si sólo
     * tuvieramos la clase InputStreamReader sería un trozo de código que tendriamos
     * que repetir por muchos lados. Para el cado concreto de leer de teclado, 
     * sería ideal si hubiese una clase en java que nos lea de golpe todo lo que ha 
     * escrito el usuario de nuestro programa y nos lo diera de un golpe.
     */
    
    /**
     * EXCEPCIONES Exception Y try-catch
     * 
     * Cuando en java puede fallar algo, por ejemplo, la conversión de la cadena en int,
     * suele avisarnos. Esto lo hace "lanzando excepciones".
     * Una excepción es algo que lanza Java para avisarnos que ha habido un problema.
     * En nuestro código podemos "capturar" esas excepciones y hacer algo para tratar de arreglaro.
     * Por ejemplo, si le pedimos al usuario que meta un número, el usuario escribe "abc",
     * lo leemos e intentamos convertirlo a int, nos salta una excepción. Si capturamos esa excepción,
     * en el código que hagamos para tratarla, podemos avisar al usuario que se ha equivocado un poco al teclear,
     * que lo intente de nuevo y volver a pedirle el número. 
     */
    static String inicializar(){
        String buzon="";
        InputStreamReader flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        try{
            buzon=teclado.readLine();
        }
        catch(IOException e){
            System.out.append("Entrada incorrecta)");
        }
        return buzon;
    }
    public static int entero(){
        int valor=Integer.parseInt(inicializar());
        return valor;
    }
    public static double real(){
        double valor=Double.parseDouble(inicializar());
        return valor;
    }
    public static String cadena(){
        String valor=inicializar();
        return valor;
    }
    public static char caracter(){
        String valor=inicializar();
        return valor.charAt(0);
    }
}
