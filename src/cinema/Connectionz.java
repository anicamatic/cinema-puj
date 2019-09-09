/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

/**
 *
 * @author Java>
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionz {
    static Connection con;
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/cinema3","root","");
            return con;
        } catch(ClassNotFoundException | SQLException ex){
            System.out.println(""+ex);
            return null;
        }
    }
}
