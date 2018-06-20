/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Container of a message
 * @author Joseph
 */
public class MessagePanel extends JPanel{
    private String message = "";
    private ArrayList<JLabel> lines = new ArrayList<>();
    /**
     * Constructor
     * @param m Set initial message to this string
     */
    public MessagePanel(String m){
        message = m;
        this.setSize(300,200);
        this.setPreferredSize(getSize());
        this.setBackground(new Color(90,90,200));
        this.setLayout(null);
        setText(m);
        this.setVisible(true);
    }
    
    private void setText(String s){
        String[] strings = s.split("\n");
        for(String line : strings){
            lines.add(new JLabel());
        }
        for (JLabel label : lines) {
            label.setText(strings[lines.indexOf(label)].trim());
            label.setSize(300, 200);
            label.setPreferredSize(label.getSize());
            label.setFont(new Font("Ariel", Font.BOLD, 18));
        }
        int place = -90; //0 is in the middle, -90 is at the top
        for(JLabel label : lines){
            label.setLocation(0, place);
            this.add(label);
            place+=18;
        }
        if(place + 90 > this.getHeight()/2){
            this.setSize(300,place+90);
            this.setPreferredSize(new Dimension(300,place+90));
            
        }
    }
    
}
