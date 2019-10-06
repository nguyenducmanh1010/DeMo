/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DEMO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author acer
 */
public class DBConnection {
    public static Connection getConnection(){
        Connection connection =null;
        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:Sqlserver:\\localhost:1433;databaseName=QLNV";
            String user="sa";
            String pass="123";
            connection =DriverManager.getConnection(url, user, pass);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        {
            return connection;
            
        }
    }
    public static void closConnection(Connection con){
        if(con !=null){
            try { 
                con.close();
            } catch (SQLException ex) {
            }
        }

    }
  
}
