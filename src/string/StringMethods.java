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
        
        String str = "Hello World!";
        System.out.println("1. char: " + str.charAt(0)); // Output: H

        
        System.out.println("2. length: " + str.length()); // Output: 12

        
        System.out.println("3. substring: " + str.substring(6)); // Output: World!
        System.out.println("   substring: " + str.substring(0, 5)); // Output: Hello

       
        System.out.println("4. contains(\"World\"): " + str.contains("World")); // Output: true

       
        String str2 = "Hello World!";
        System.out.println("5. str is equals(str2): " + str.equals(str2)); // Output: true

        
        System.out.println("6. UpperCase: " + str.toUpperCase()); // Output: HELLO WORLD!

        
        System.out.println("7. LowerCase: " + str.toLowerCase()); // Output: hello world!

        
        System.out.println("8. replace 'o' by 'a': " + str.replace('o', 'a')); // Output: Hella Warld!
       
        System.out.println("9. indexOf'W': " + str.indexOf('W')); // Output: 6
        System.out.println("   indexOf\"World\": " + str.indexOf("World")); // Output: 6

    
        String str3 = "   Java  ";
        System.out.println("10. trim: \"" + str3.trim() + "\""); // Output: "Java Programming"
    }
}
