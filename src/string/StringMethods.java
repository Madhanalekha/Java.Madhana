/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

/**
 *
 * @author madha
 */
public class StringMethods {
     public static void main(String[] args) {
         System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
        
        String str = "Hello World!";
        System.out.println("1. char: " + str.charAt(0)); 

        
        System.out.println("2. length: " + str.length());

        
        System.out.println("3. substring: " + str.substring(6)); 
        System.out.println("   substring: " + str.substring(0, 5)); 

       
        System.out.println("4. contains(\"World\"): " + str.contains("World"));

       
        String str2 = "Hello World!";
        System.out.println("5. str is equals(str2): " + str.equals(str2)); 

        
        System.out.println("6. UpperCase: " + str.toUpperCase()); 
  
        System.out.println("7. LowerCase: " + str.toLowerCase());
        
        System.out.println("8. replace 'o' by 'a': " + str.replace('o', 'a')); 
       
        System.out.println("9. indexOf'W': " + str.indexOf('W'));
        System.out.println("   indexOf\"World\": " + str.indexOf("World")); 

    
        String str3 = "   Java  ";
        System.out.println("10. trim: \"" + str3.trim() + "\""); 
    }
}
