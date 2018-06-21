/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

import javax.swing.JOptionPane;

/**
 * Represents a user, author of a message
 * @author Joseph
 */
public class Author {
    public int id = (int)(Math.random()*99999);
    public String name = "";
    private static Author localAuthor = null;
    
    /**
     * 
     * @param n name 
     */
    public Author(String n){
        name = n;
    }
    
    public static Author getLocalAuthor(){
        if(localAuthor==null){
            String username = null;
            while(username == null || username.trim() == ""){
                username = JOptionPane.showInputDialog("Enter name for user");
            }
            localAuthor = new Author(username);
        }
        return localAuthor;
    }
}
