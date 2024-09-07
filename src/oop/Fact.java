/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author madha
 */
public class Fact {
    
    static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args){
    int n=5;
    System.out.println(factorial(n));
}
}
