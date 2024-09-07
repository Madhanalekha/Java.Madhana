/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
to edit this template
 */
package madhanalekha;

import java.util.Scanner;
class Animal{
    String name;
    String species;
    int age;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter animal's name: ");
        name = sc.nextLine();
        System.out.print("Enter species: ");
        species = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    void displayDetails() {
        System.out.println("Animal's Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years\n");
    }
}

public class AnimalDetails {
    public static void main(String[] args) {
        System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of animals in the zoo: ");
        int count = sc.nextInt();
        sc.nextLine(); 

        Animal[] animals = new Animal[count];

        for (int i = 0; i < count; i++) {
            animals[i] = new Animal();
            System.out.println("Enter details for Animal " + (i + 1) + ":");
            animals[i].getDetails();
        }

        System.out.println("\nDetails of all animals in the zoo:\n");
        for (int i = 0; i < count; i++) {
            animals[i].displayDetails();
        }
    }
}
