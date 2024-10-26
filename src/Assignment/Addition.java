/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author madha
 */
class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
 
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
}

public class Addition {
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();

       
        System.out.println("Addition of two integers: " + calc.add(10, 20)); 
        System.out.println("Addition of three integers: " + calc.add(10, 20, 30)); 
        System.out.println("Addition of two doubles: " + calc.add(10.5, 20.5)); 
    }
}
