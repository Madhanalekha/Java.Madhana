/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author madha
 */
class Parent {
    void show(){
        System.out.println("Parent class method");
    }
}
class Child extends Parent{
     void show(){
        System.out.println("Child class method");
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        Parent parent=new Parent();
        Parent child=new Child();
        parent.show();
        child.show();
    }
}
