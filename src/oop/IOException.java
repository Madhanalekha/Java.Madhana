/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author madha
 */
import java.io.*;
public class IOException {
     public static void main(String[] args) 
    { 
        
        try { 
           
            FileReader file = new FileReader("file.txt"); 
  
            // Trying to read a file that doesn't exists 
            System.out.println(file.read()); 
        } 
        
        
        catch (Exception exp) { 
            
  
            
            System.out.println("Error occured: "
                               + exp); 
        } 
        
        
        finally { 
            System.out.println( 
                "Finally block will always executed, irrespective of occurence of issue"); 
        } 
    } 
    
}
