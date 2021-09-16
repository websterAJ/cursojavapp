/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.gui;

import chat.socket.socket;
import chat.socket.socketClient;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ALEXA
 */
public class gui { 
    public void Ventana() {        
        // Creando el Marco        
        JFrame frame = new JFrame("Chat Frame");       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.setSize(400, 400);        
        // Creando MenuBar y agregando componentes   
        JMenuBar mb = new JMenuBar();       
        JMenu m1 = new JMenu("ARCHIVO");       
        JMenu m2 = new JMenu("Ayuda");       
        mb.add(m1);       
        mb.add(m2);       
        JMenuItem m11 = new JMenuItem("Abrir");       
        JMenuItem m22 = new JMenuItem("Guardar como");       
        m1.add(m11);       
        m1.add(m22);        
        // Creando el panel en la parte inferior y agregando componentes       
        JPanel panel = new JPanel(); // el panel no está visible en la salida      
        JLabel label = new JLabel("Introducir texto");
        // Área de texto en el centro    
        JTextArea ta = new JTextArea();    
        JTextField tf = new JTextField(10); // acepta hasta 10 caracteres        
        JButton send = new JButton("Enviar");       
        JButton reset = new JButton("Restablecer");       
        panel.add(label); // Componentes agregados usando Flow Layout     
        panel.add(label); // Componentes agregados usando Flow Layout      
        panel.add(tf);       
        panel.add(send);
        send.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try {
                    socketClient conexion = new socketClient();
                    String respuesta = conexion.sendMessage(tf.getText());
                    ta.append(respuesta+"\n");
                } catch (IOException ex) {
                    Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        panel.add(reset);        
            
        // Agregar componentes al marco.      
        frame.getContentPane().add(BorderLayout.SOUTH, panel);       
        frame.getContentPane().add(BorderLayout.NORTH, mb);       
        frame.getContentPane().add(BorderLayout.CENTER, ta);       
        frame.setVisible(true);   
    }
}