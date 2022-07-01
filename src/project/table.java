/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package project;

import java.sql.*;
import javax.swing.JOptionPane;
public class table {
    public static void main (String[] args){
    Connection con= null;
    Statement st= null;
    try{
        con=Connectionmysql.getCon();
        //st.executeUpdate("create table user(name varchar(200),email varchar(200),password varchar(50),securityQuestion varchar(200),answer varchar(200),address varchar(200),status varchar(200))");
        JOptionPane.showMessageDialog(null,"Table created Successfully");
        
    }catch(Exception e){
        //JOptionPane.showMessageDialog(null, e);
        System.out.println(e);
    }
    finally{
            try{
                con.close();
                st.close();
    }catch(Exception e){
                System.out.println(e);
               
        }
    
      }
    
    }
    
}
*/