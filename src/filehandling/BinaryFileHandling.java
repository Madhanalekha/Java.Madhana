/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class BinaryFileHandling {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Name: Madhanalekha L\nReg No: 2303717710422026");
        System.out.println("Enter the data you want to write to the binary file:");
        String data = scanner.nextLine();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("binaryfile.dat");
            fos.write(data.getBytes());
            System.out.println("Successfully wrote binary data to the file.");
            fos.close();
        } catch (IOException e) {
            System.out.println("An error occurred during writing.");
            e.printStackTrace();
        } 

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("binaryfile.dat");
            int byteData;
            System.out.println("Reading from the binary file:");
            while ((byteData = fis.read()) != -1) {
                
                System.out.print((char) byteData);
            }
            System.out.println("\nBinary file reading completed.");
              fis.close();
        } catch (IOException e) {
            System.out.println("An error occurred during reading.");
            e.printStackTrace();
        } 
    }
    
}
