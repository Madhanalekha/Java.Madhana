/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

/**
 *
 * @author madha
 */
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
public class TreeMapEx {
  
    public static void main(String[] args) {
        System.out.println("Name : Madhanalekha L \nReg no : 2303717710421026");
        TreeMap<String, Integer> studentScores = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();
        scanner.nextLine();        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ":");
            String name = scanner.nextLine();
            System.out.println("Enter the score of " + name + ":");
            int score = scanner.nextInt();
            scanner.nextLine(); 
            studentScores.put(name, score);
        }
        System.out.println("Student Scores (sorted by name): " + studentScores);
        System.out.println("Enter the name of the student to get their score:");
        String student = scanner.nextLine();
        if (studentScores.containsKey(student)) {
            System.out.println("Score of " + student + ": " + studentScores.get(student));
        } else {
            System.out.println(student + " is not in the list.");
        }
        System.out.println("Enter the name of the student to remove:");
        String studentToRemove = scanner.nextLine();
        studentScores.remove(studentToRemove);
        System.out.println("Student Scores after removing " + studentToRemove + ": " + studentScores);
        System.out.println("All students and their scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
  

