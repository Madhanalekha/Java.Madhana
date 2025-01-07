package Madhanalekha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCInsertDeleteUpdate {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/Madhanalekha?useSSL=false&serverTimezone=UTC";
    private static final String USERNAME = "root"; 
    private static final String PASSWORD = ""; 
    private String tableName;
    private String primaryColumn;
    private String secondaryColumn;

    public static void main(String[] args) {
        
        System.out.println("Madhanalekha\n2303717710422026\n");
        
        JDBCInsertDeleteUpdate example = new JDBCInsertDeleteUpdate();
        
        example.createTable();
        
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nChoose an action:");
            System.out.println("1 - Insert Record");
            System.out.println("2 - Update Record");
            System.out.println("3 - Delete Record");
            System.out.println("4 - Display Records");
            System.out.println("5 - Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter " + example.primaryColumn + ": ");
                    int primaryValueInsert = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter " + example.secondaryColumn + ": ");
                    String secondaryValueInsert = scanner.nextLine();
                    example.insertRecord(primaryValueInsert, secondaryValueInsert);
                    break;

                case 2:
                    System.out.print("Enter " + example.primaryColumn + " to update: ");
                    int primaryValueUpdate = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter new " + example.secondaryColumn + ": ");
                    String secondaryValueUpdate = scanner.nextLine();
                    example.updateRecord(primaryValueUpdate, secondaryValueUpdate);
                    break;

                case 3:
                    System.out.print("Enter " + example.primaryColumn + " to delete: ");
                    int primaryValueDelete = scanner.nextInt();
                    example.deleteRecord(primaryValueDelete);
                    break;

                case 4:
                    example.displayRecords();
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
    }

    public void createTable() {
        Connection connection = null;
        Statement statement = null;
        Scanner scanner = new Scanner(System.in);

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            
            System.out.print("Enter the table name: ");
            tableName = scanner.nextLine();
            
            System.out.print("Enter primary column name: ");
            primaryColumn = scanner.nextLine();
            
            System.out.print("Enter secondary column name: ");
            secondaryColumn = scanner.nextLine();
            
            String sql = "CREATE TABLE IF NOT EXISTS " + tableName + " (" 
                        + primaryColumn + " INT PRIMARY KEY, "
                        + secondaryColumn + " VARCHAR(100) NOT NULL)";
            statement.executeUpdate(sql);
            System.out.println("Table '" + tableName + "' created or ready for use.");
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResources(statement, connection);
        }
    }

    public void insertRecord(int primaryValue, String secondaryValue) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            String sql = "INSERT INTO " + tableName + " (" + primaryColumn + ", " + secondaryColumn + ") VALUES (" 
                         + primaryValue + ", '" + secondaryValue + "')";
            int rowsAffected = statement.executeUpdate(sql);
            System.out.println("Inserted " + rowsAffected + " row(s) successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResources(statement, connection);
        }
    }

    public void updateRecord(int primaryValue, String newSecondaryValue) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            String sql = "UPDATE " + tableName + " SET " + secondaryColumn + "='" + newSecondaryValue + "' WHERE " 
                         + primaryColumn + "=" + primaryValue;
            int rowsAffected = statement.executeUpdate(sql);
            System.out.println("Updated " + rowsAffected + " row(s) successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResources(statement, connection);
        }
    }

    public void deleteRecord(int primaryValue) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            String sql = "DELETE FROM " + tableName + " WHERE " + primaryColumn + "=" + primaryValue;
            int rowsAffected = statement.executeUpdate(sql);
            System.out.println("Deleted " + rowsAffected + " row(s) successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResources(statement, connection);
        }
    }

    public void displayRecords() {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            String sql = "SELECT " + primaryColumn + ", " + secondaryColumn + " FROM " + tableName;
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("Record Data:");
            while (resultSet.next()) {
                int primaryValue = resultSet.getInt(primaryColumn);
                String secondaryValue = resultSet.getString(secondaryColumn);
                System.out.println(primaryColumn + ": " + primaryValue + ", " + secondaryColumn + ": " + secondaryValue);
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
