/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class insertUpdateDelete {

public static void setData(String Query,String msg){

    Connection con=null;
    Statement st=null;
    
    try{
    
        con=Connectionmysql.getCon();
        st=con.createStatement();
        st.executeUpdate(Query);
        if(!msg.equals(""))
            JOptionPane.showMessageDialog(null, msg);
    }catch(Exception e){
    
    }
    finally{
        try{
    
    }catch(Exception e){
    
    }
    }
}    
}
