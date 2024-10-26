/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CreateReadWriteFile {
  
    public static void main(String[] args) {
        //System.out.println("Name: Madhanalekha L\nReg No: 2303717710422026");
       
        File file = new File("example.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter the content you want to write to the file:");
            String userInput = scanner.nextLine();

            FileWriter fw = new FileWriter("example.txt");
            fw.write(userInput);
            fw.close();
            System.out.println("Successfully wrote");
          
            FileReader fr = new FileReader("example.txt");
            int ch;
            System.out.print("Reading file content: ");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


    

