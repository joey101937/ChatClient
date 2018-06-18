/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

/**
 *
 * @author Joseph
 */
public class ChatFrame {
    private JFrame core;
    private JPanel panel;
    private JScrollPane scrollPane;
    private JPanel interior;
    private JTextPane textPane;
    
    private void initComponents(){
        core = new JFrame();
        core.setSize(700,700);
        
        core.setDefaultCloseOperation(3); //exit on close
        
        panel = new JPanel();
        panel.setSize(core.getSize());
        panel.setLayout(null);
        core.add(panel);
        panel.setBackground(Color.white);
        
        
        interior = new JPanel();
        interior.setSize(450, 1000);
        interior.setLocation(0,0);
        interior.setPreferredSize(interior.getSize());
        System.out.println("text pref size is " + interior.getPreferredSize());
        interior.setBackground(Color.gray);
        
        
        scrollPane = new JScrollPane();
        scrollPane.setSize(500,500);
        scrollPane.setPreferredSize(scrollPane.getSize());
        System.out.println(scrollPane.getSize());
        scrollPane.setLocation(100, 100);
        scrollPane.add(interior);
        scrollPane.setViewportView(interior);
        panel.add(scrollPane);
        
        
        textPane = new JTextPane();
        textPane.setBackground(Color.red);
        textPane.setSize(interior.getSize());
        textPane.setPreferredSize(interior.getSize());
        interior.add(textPane);
        
        core.setVisible(true);
        
    }
    public ChatFrame(){
        initComponents();
    }
    
    public static void main(String[] args){
        ChatFrame cf = new ChatFrame();
        
    }
}
