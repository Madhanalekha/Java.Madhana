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
   
        StringBuffer sb = new StringBuffer("Welcome");

 
        sb.append(" to Java");
        System.out.println("After append: " + sb);  // Output: Welcome to Java

        sb.insert(7, " all");
        System.out.println("After insert: " + sb);  // Output: Welcome all to Java
        sb.replace(7, 10, "everyone");
        System.out.println("After replace: " + sb);  // Output: Welcome everyone to Java

        sb.delete(7, 15);
        System.out.println("After delete: " + sb);  // Output: Welcome to Java

        sb.reverse();
        System.out.println("After reverse: " + sb);  // Output: avaJ ot emocleW
       
        sb.reverse();
      
        System.out.println("Length: " + sb.length());  // Output: 15
 
        System.out.println("Capacity : " + sb.capacity());  // Output: 31 (default + content)
    
        sb.setCharAt(0, 'w');
        System.out.println("After setCharAt: " + sb);  // Output: welcome to Java
        
        String sub = sb.substring(0, 7);
        System.out.println("Substring (0, 7): " + sub);  // Output: welcome
    }
}
