
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rakib
 */
public class DBConnect {
      public static Connection connect(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/empmange","vatiza","admin");
        }catch(Exception ex){
            System.out.print(ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return con;
    }
    
}
