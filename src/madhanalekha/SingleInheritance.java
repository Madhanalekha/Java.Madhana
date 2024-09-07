/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package madhanalekha;
    class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void introduce() {
        System.out.println("Name:" + name +"\nAge: " + age );
    }
}
class Student extends Person {
    String school;

    Student(String name, int age, String school) {
        
        super(name, age);
        this.school = school;
    }
    void study() {
        System.out.println(name + " is studying at " + school );
    }
}
public class SingleInheritance {
     public static void main(String[] args) {
        System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
        Student student = new Student("Alex", 20, "Harvard University");
        
        student.introduce();
        
        student.study();
    }
}
