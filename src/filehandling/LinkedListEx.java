/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

/**
 *
 * @author madha
 */
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListEx {
  
    public static void main(String[] args) {
        System.out.println("Name :Manikandan M \nReg no. : 2303717710421028");
        LinkedList<String> fruits = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of fruits you want to add:");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("Enter fruit " + (i + 1) + ":");
            String fruit = scanner.nextLine();
            fruits.add(fruit);
        }
        System.out.println("Fruits List: " + fruits);
        System.out.println("Enter the index of the fruit you want to access:");
        int index = scanner.nextInt();
        if (index >= 0 && index < fruits.size()) {
            System.out.println("Fruit at index " + index + ": " + fruits.get(index));
        } else {
            System.out.println("Invalid index!");
        }
        scanner.nextLine(); 
        System.out.println("Enter the name of the fruit to remove:");
        String fruitToRemove = scanner.nextLine();
        fruits.remove(fruitToRemove);
        System.out.println("Fruits List after removing " + fruitToRemove + ": " + fruits);
    }
}
  

