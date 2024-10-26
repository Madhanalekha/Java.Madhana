/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

/**
 *
 * @author madha
 */
import java.io.*;
class Employee implements Serializable {
    String name;
    int id;
    String department;
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    @Override
    public String toString() {
        return "Employee Name: " + name + "\n" +
               "Employee ID: " + id + "\n" +
               "Employee Department: " + department;
    }
}
public class SerialDeserial {
   
    public static void main(String[] args) {
        
        System.out.println("Name:Madhanalekha L\nReg No: 2303717710422026");
      
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.txt"))) {
            Employee emp = new Employee("Madhanalekha", 128, "Engineering");
            oos.writeObject(emp);
            
            System.out.println("Serialized Objecct:\n"+emp);

        } catch (IOException e) {
            e.printStackTrace();
        }

       
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.txt"))) {
            Employee emp2 = (Employee) ois.readObject();
            
            System.out.println("Deserialized Object:\n"+emp2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

    

