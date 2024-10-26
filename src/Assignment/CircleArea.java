/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author madha
 */
import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System .out. println("Enter the radius of the cirle:");
        double radius=scanner.nextDouble();
        double area=Math.PI*radius*radius;
        System.out.println("The area of the circle:" + area);
        scanner.close();
        
    } 
    
}
