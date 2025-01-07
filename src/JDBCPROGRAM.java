/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author madha
 */
import java.sql.*;
public class JDBCPROGRAM {
    private static String url="jdbc:mysql://localhost:3306/Madhanalekha";
    private static String user="root";
    private static String password="";
    
    public static void main(String[] args)
    {
        Connection con=null;
        Statement stmt=null;
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection(url,user,password);
        stmt=con.createStatement();
        String s="SELECT Name,IDNo FROM employee";
        ResultSet rs=stmt.executeQuery(s);
        
        while(rs.next())
        {
            System.out.println("Employee data");
            
            System.out.println(rs.getString(1));
            System.out.println(rs.getInt(2));
        }
        }
        catch(Exception e) {}
        
    }
}
