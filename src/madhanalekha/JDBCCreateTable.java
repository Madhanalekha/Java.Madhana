/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package madhanalekha;

/**
 *
 * @author madha
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCCreateTable {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test";
    private static final String USERNAME = "root"; 
    private static final String PASSWORD = ""; 
    private static String tableName;

    public static void main(String[] args) {
        
        System.out.println("Madhanalekha\n2303717710422026\n");
        JDBCCreateTable example = new JDBCCreateTable();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("\nChoose an option:");
        System.out.println("1. Create Table");
        System.out.println("2. Insert Student");
        System.out.println("3. Update Student Name");
        System.out.println("4. Delete Student");
        System.out.println("5. Display All Students");
        System.out.println("6. Exit");
        
        while (!exit) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the table to create: ");
                    tableName = scanner.nextLine();
                    System.out.print("Enter the number of columns: ");
                    int columnCount = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    example.createTable(tableName, columnCount);
                    break;
                case 2:
                    System.out.print("Enter Roll No: ");
                    int rollNo = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    example.insertStudent(rollNo, name);
                    break;
                case 3:
                    System.out.print("Enter Roll No to update: ");
                    rollNo = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter new Name: ");
                    String newName = scanner.nextLine();
                    example.updateStudentName(rollNo, newName);
                    break;
                case 4:
                    System.out.print("Enter Roll No to delete: ");
                    rollNo = scanner.nextInt();
                    example.deleteStudent(rollNo);
                    break;
                case 5:
                    example.displayStudents();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
    }

    public void createTable(String tableName, int columnCount) {
        Connection connection = null;
        Statement statement = null;
        Scanner scanner = new Scanner(System.in);

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();

            StringBuilder sql = new StringBuilder("CREATE TABLE IF NOT EXISTS " + tableName + " (");
            
            for (int i = 1; i <= columnCount; i++) {
                System.out.print("Enter the name for column " + i + ": ");
                String columnName = scanner.nextLine();

                System.out.print("Enter the data type for column " + i + " (e.g., INT, VARCHAR(100)): ");
                String dataType = scanner.nextLine();

                sql.append(columnName).append(" ").append(dataType);

                if (i < columnCount) {
                    sql.append(", ");
                }
            }
            sql.append(")");

            statement.executeUpdate(sql.toString());
            System.out.println("Table '" + tableName + "' created successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResources(statement, connection);
        }
    }

    public void insertStudent(int rollNo, String name) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            String sql = "INSERT INTO " + tableName + " (RollNo, Name) VALUES (" + rollNo + ", '" + name + "')";
            int rowsAffected = statement.executeUpdate(sql);
            System.out.println("Inserted " + rowsAffected + " row(s) successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResources(statement, connection);
        }
    }

    public void updateStudentName(int rollNo, String newName) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            String sql = "UPDATE " + tableName + " SET Name='" + newName + "' WHERE RollNo=" + rollNo;
            int rowsAffected = statement.executeUpdate(sql);
            System.out.println("Updated " + rowsAffected + " row(s) successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResources(statement, connection);
        }
    }

    public void deleteStudent(int rollNo) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            String sql = "DELETE FROM " + tableName + " WHERE RollNo=" + rollNo;
            int rowsAffected = statement.executeUpdate(sql);
            System.out.println("Deleted " + rowsAffected + " row(s) successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResources(statement, connection);
        }
    }

    public void displayStudents() {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            String sql = "SELECT RollNo, Name FROM " + tableName;
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("Student Data:");
            while (resultSet.next()) {
                int rollNo = resultSet.getInt("RollNo");
                String name = resultSet.getString("Name");
                System.out.println("RollNo: " + rollNo + ", Name: " + name);
            }

            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResources(statement, connection);
        }
    }

    private void closeResources(Statement statement, Connection connection) {
        try {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




