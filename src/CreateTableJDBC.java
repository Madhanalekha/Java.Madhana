/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author madha
 */

import java.sql.*;
import java.util.Scanner;
public class CreateTableJDBC {
    private String url="jdbc:mysql://localhost:3306/Madhanalekha";
    private String user="root";
    private String password="";
    public String tableName;
    public String primaryCol;
    public String secondaryCol;
    
    public static void main(String[] args)
    {
        Connection con=null;
        Statement stmt=null;
        Scanner scn= new Scanner(System.in);
        CreateTableJDBC ex=new CreateTableJDBC();
        ex.createTable();
        ex.insert("Madhan",50);
        ex.update("LAKCHU",46);
        ex.delete(47);
                
        
    }
    public void createTable()
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the name of the table:");
        tableName=scn.nextLine();
        System.out.println("enter the name of the primary col:");
        primaryCol=scn.nextLine();
        System.out.println("enter the name of the Secondarycol:");
        secondaryCol=scn.nextLine();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,user,password);
        Statement stmt=con.createStatement();
        String s="CREATE TABLE IF NOT EXISTS "+ tableName +" (" 
                + primaryCol + " INT PRIMARY KEY,"
                + secondaryCol + " VARCHAR(100) NOT NULL)";
        /* String sql = "CREATE TABLE IF NOT EXISTS " + tableName + " (" 
                       + primaryCol + " INT PRIMARY KEY, "
                       + secondaryCol + " VARCHAR(100) NOT NULL)";*/
        int n=stmt.executeUpdate(s);
        System.out.println(n);
        }
        catch(Exception e){
        System.out.println("Error occured"+e);

        }
               
    }
    public void insert(String str,int n)
    {
        try{
        Connection con= DriverManager.getConnection(url,user,password);
        Statement stmt=con.createStatement();
        String s="INSERT INTO "+tableName+"("+primaryCol+", "+secondaryCol+") VALUES("+n+",'"+ str +"')";
        int l=stmt.executeUpdate(s);
        System.out.println(l);
        }
        catch(Exception e){
        System.out.println("Error occured"+e);
        }
    }
    public void update(String str,int n)
    {
        try{
        Connection con= DriverManager.getConnection(url,user,password);
        Statement stmt=con.createStatement();
        String s="UPDATE "+tableName+" SET "+secondaryCol+"='"+str+"' WHERE "+primaryCol+"="+n;
        int l=stmt.executeUpdate(s);
        System.out.println(l);
        }
        catch(Exception e){
        System.out.println("Error occured"+e);
        }
    }
    public void delete(int n)
    {
        try{
        Connection con= DriverManager.getConnection(url,user,password);
        Statement stmt=con.createStatement();
        String s="DELETE FROM "+tableName+" WHERE "+primaryCol+"="+n;
        int l=stmt.executeUpdate(s);
        System.out.println(l);
        }
        catch(Exception e){
        System.out.println("Error occured"+e);
        }
    }
}
/*
import java.sql.*;
import java.util.Scanner;

public class CreateTableJDBC {
    private final String url = "jdbc:mysql://localhost:3306/Madhanalekha";
    private final String user = "root";
    private final String password = "";
    private String tableName;
    private String primaryCol;
    private String secondaryCol;

    public static void main(String[] args) {
        CreateTableJDBC ex = new CreateTableJDBC();

        try (Scanner scn = new Scanner(System.in)) {
            ex.createTable(scn);
            ex.insert("Madhan", 45);
        }
    }

    public void createTable(Scanner scn) {
        System.out.println("Enter the name of the table:");
        tableName = scn.nextLine();
        System.out.println("Enter the name of the primary column:");
        primaryCol = scn.nextLine();
        System.out.println("Enter the name of the secondary column:");
        secondaryCol = scn.nextLine();

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String sql = "CREATE TABLE IF NOT EXISTS " + tableName + " (" +
                    primaryCol + " INT PRIMARY KEY, " +
                    secondaryCol + " VARCHAR(100) NOT NULL)";
            int n = stmt.executeUpdate(sql);
            System.out.println("Table creation status: " + (n == 0 ? "Success" : "Modified"));
        } catch (Exception e) {
            System.out.println("Error occurred: " + e);
        }
    }

    public void insert(String str, int n) {
        if (tableName == null || primaryCol == null || secondaryCol == null) {
            System.out.println("Table or columns are not initialized. Please create the table first.");
            return;
        }

        String sql = "INSERT INTO " + tableName + " (" + primaryCol + ", " + secondaryCol + ") VALUES (?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setInt(1, n);
            pstmt.setString(2, str);
            int rowsInserted = pstmt.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);
        } catch (Exception e) {
            System.out.println("Error occurred during insertion: " + e);
        }
    }
}
*/
