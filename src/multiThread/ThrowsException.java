/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiThread;
 import java.util.Scanner;
public class ThrowsException {
   
    
    public static void checkNumber(int number) throws IllegalArgumentException {
        if (number < 0) {
            
            throw new IllegalArgumentException("Number cannot be negative.");
        } else {
            System.out.println("Number is positive.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter a positive number: ");
            int number = scanner.nextInt();
            
            checkNumber(number);

        } catch (IllegalArgumentException e) {
            
            System.out.println("Exception caught" );
        } finally {
            
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }

}
