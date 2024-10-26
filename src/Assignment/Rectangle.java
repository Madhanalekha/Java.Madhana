/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author madha
 */
public class Rectangle {
    double length;
    double width;
    Rectangle(){
        length=1.0;
        width=1.0;
        System.out.println("Default constructor: \n length="+length+" width="+width);
    }
    Rectangle(double l, double w){
        length=l;
        width=w;
        System.out.println("Parameterized constructor: \n length="+length+"width="+width);
    }
    Rectangle(Rectangle r){
        length=r.length;
        width=r.width;
        System.out.println("Copy constructor: \n length="+length+"width="+width);
    }
    double area(){
        return length*width;
    }
    void display(){
      System.out.println("Rectangle[ length="+length+" width="+width +" ]");  
    }
    public static void main(String[] args){
        Rectangle r1=new Rectangle();
        r1.display();
        System.out.println("Area:"+r1.area());
        Rectangle r2=new Rectangle(5.0,3.0);
        r2.display();
        System.out.println("Area:"+r2.area());
        Rectangle r3=new Rectangle(r2);
        r3.display();
        System.out.println("Area:"+r3.area());
    }
    
}
