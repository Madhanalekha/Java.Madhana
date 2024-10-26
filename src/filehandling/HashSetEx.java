/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

/**
 *
 * @author madha
 */
import java.util.HashSet;
import java.util.Scanner;
public class HashSetEx {
   
    public static void main(String[] args) {
        System.out.println("Name :Manikandan M\nReg no. : 2303717710421028");
        HashSet<Integer> numbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers you want to add:");
        int n = scanner.nextInt();   
      
        for( int i=0;i<n;i++) {
            System.out.println("Enter integer " + (i + 1) + ":");
            int number = scanner.nextInt();
            numbers.add(number); 
        }
                
        System.out.println("Numbers Set: " + numbers);
        System.out.println("Enter a number to check if it is in the set:");
        int checkNumber = scanner.nextInt();
        System.out.println("Does set contain " + checkNumber + "? " + numbers.contains(checkNumber));
        System.out.println("Enter a number to remove from the set:");
        int numberToRemove = scanner.nextInt();
        numbers.remove(numberToRemove);
        System.out.println("Set after removing " + numberToRemove + ": " + numbers);
    }
}

    

