/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author madha
 */
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, String department) {
        super(name); 
        this.department = department;
    }

    void manage() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}
class Director extends Manager {
    String region;

    Director(String name, String department, String region) {
        super(name, department); 
        this.region = region;
    }

    void strategize() {
        System.out.println(name + " is strategizing for the " + region + " region.");
    }
}

public class Multilevelinheritance {
    public static void main(String[] args) {
        System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
        Director director = new Director("Alice", "Sales", " America");

        
        director.work();        
        director.manage();      
        director.strategize();  
    }
}
