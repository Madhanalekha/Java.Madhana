/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JavaDBMS {

    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/test"; 
        String username = "root"; 
        String password = ""; 
        System.out.println("No error here!");
        Connection connection = null;
        Statement statement = null;

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Database connected successfully!");

            statement = connection.createStatement();
            String sql = "SELECT *  from sample";
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("Employee Data:");
            while (resultSet.next()) {
                int id = resultSet.getInt("RollNo");
                String name = resultSet.getString("Name");
                System.out.println("RollNO: " + id + ", Name: " + name);
            }
            resultSet.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}



