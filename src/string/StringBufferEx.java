/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

/**
 *
 * @author madha
 */
import java.lang.StringBuffer;
public class StringBufferEx {
    public static void main(String[] args) {
        System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
   
        StringBuffer sb = new StringBuffer("Welcome");

        sb.append(" to Java");
        System.out.println("After append: " + sb);  
       
        sb.insert(7, " all");
        System.out.println("After insert: " + sb);  
        sb.replace(7, 10, "everyone");
        System.out.println("After replace: " + sb);  

        sb.delete(7, 15);
        System.out.println("After delete: " + sb); 

        sb.reverse();
        System.out.println("After reverse: " + sb);     
        sb.reverse();
        
        System.out.println("Length: " + sb.length()); 
 
        System.out.println("Capacity : " + sb.capacity());  
    
        sb.setCharAt(4, 'w');
        System.out.println("After setCharAt: " + sb);  
        
        String sub = sb.substring(0, 7);
        System.out.println("Substring (0, 7): " + sub); 
    }
}
