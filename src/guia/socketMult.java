/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Alexander torres
 */
public class socketMult implements Runnable {
    private Socket con = null;
    public static void main(String[] args) {
        try {
            ServerSocket s = new ServerSocket(8888);
            System.out.println("====================================================");
            System.out.println("===                Servidor iniciado             ===");
            System.out.println("====================================================");
            System.out.println("===                Esperando...                  ===");
            System.out.println("====================================================");
            while (true) {
                Socket c = s.accept();
                printSocketInfo(c);
                socketMult v = new socketMult(c);
                Thread t = new Thread(v);
                t.start();
            }
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }
    public socketMult(Socket c){
        con = c;
    }
    @Override
   public void run() {
        try {
            BufferedReader r;
            try (BufferedWriter w = new BufferedWriter(new OutputStreamWriter(
                    con.getOutputStream()))) {
                r = new BufferedReader(new InputStreamReader(
                        con.getInputStream()));
                String m;
                int d=0;
                while ((m=r.readLine())!= null) {
                    System.out.println(m);
                    d += m.length();
                    System.out.println(d);
                    if (m.equals(".")) break;
                    char[] a = m.toCharArray();
                    int n = a.length;
                    for (int i=0; i<n/2; i++) {
                        char t = a[i];
                        a[i] = a[n-1-i];
                        a[n-i-1] = t;
                    }
                    w.write(a,0,n);
                    w.newLine();
                    w.flush();
                }
                
                System.out.println("===                Esperando...                  ===");
                System.out.println("====================================================");
            }
        r.close();
        con.close();
        } catch (IOException e) {
            System.err.println(e.toString());
        }
   }
    private static void printSocketInfo(Socket s) {
        System.out.println("Cliente conectado Ip = "+s.getInetAddress().toString()+" Puerto: "+s.getPort());
    }
}
