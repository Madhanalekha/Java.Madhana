/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author madha
 */
class Employee{
    private double salary;
    private String name;
    Employee(String n,double s){
        name=n;
        salary=s;
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    double getSalary(){
        return salary;
    }
    void setSalary(double salary){
        this.salary=salary;
    }
    void raiseSalary(double percent){
        salary+=salary *percent/100;
    }
}
class Manager extends Employee{
    double bonus;
    Manager(String n,double s,double b){
        super(n,s);
        bonus=b;
    }
    double getBonus(){
        return bonus;
    }
    
    double getSalary(){
        return super.getSalary()+bonus;
    }
    
    
} 
public class Demo {
    public static void main(String[] args){
        Employee e1=new Employee("Ram",50000);
        e1.raiseSalary(10);
        System.out.println(e1.getSalary());
        
        Manager m1=new Manager("Ragu",60000,2000);
        m1.getSalary();
        System.out.println(m1.getSalary());
        Employee e2=new Manager("Ramya", 68000,2000);
        System.out.println(e2.getSalary());
        Employee[] emp=new Employee[5];//if we alocate maore memory for the array but we could not assign the value to the variable it will give you exception message
        emp[0]=new Employee("raj",20000);
        emp[1]=new Employee("Muthir",23400);
        emp[2]=new Employee("Anir",27000);
        emp[3]=m1;
        emp[4]=new Manager("Ramya", 68000,2000);
        Manager m2=(Manager)emp[4];
        //  emp[3].getBonus(); it will give error message because it was an employee class
        for(Employee e:emp)//dynamic binding
        {
            System.out.println(e.getName()+" "+e.getSalary());
        }
        System.out.println(m2.getBonus());
        Manager m3;
        if(emp[2] instanceof Manager)// which is used to check is the obj is either superclass or subclass
            m3=(Manager)emp[2];
    }
}
