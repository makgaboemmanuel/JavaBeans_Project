/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanfields.beans;
import java.sql.*; 
/**
 *
 * @author Mathekga M. Emmanuel
 */
public class DB_Conn {
    
    private Connection conn;
    private  Statement st; 
    private ResultSet rs; 
 
    public Connection getConnection()
    {
        try{
           String url = "jdbc:mysql://localhost:3306/student?zeroDateTimeBehavior=convertToNull"; 
           String user = "root";
           String pass = "abcdef";
           
           Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection(url, user, pass); 
           
        }
        
        catch(SQLException ex)
                   {
                   System.out.println(ex.toString() +  ": No Connection / Failure");
                   }
        catch(Exception ex)
        {
            System.out.println(ex.toString() +  ": No Connection / Failure");
        }
        
        finally{
            return conn; 
        }
    }
    
    public ResultSet searchQuery(String sql)
    {
        try{
           getConnection();
           st = conn.createStatement();
           rs = st.executeQuery(sql); 
        }
        
        catch(SQLException ex)
        {
            System.out.println(ex.toString() + ", Connection Failure");
        }
        
        return rs;
    }
}
