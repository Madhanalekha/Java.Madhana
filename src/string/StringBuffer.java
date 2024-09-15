/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

/**
 *
 * @author madha
 */

public class StringBuffer {
  
    public static void main(String[] args) {
        // 1. Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // 2. append() - Appending string to StringBuffer
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: Hello World

        // 3. insert() - Inserting string at a specific position
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb); // Output: Hello Java World

        // 4. replace() - Replacing characters between start and end indices
        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb); // Output: Hello C++ World

        // 5. delete() - Deleting characters between start and end indices
        sb.delete(6, 10);
        System.out.println("After delete: " + sb); // Output: Hello World

        // 6. reverse() - Reversing the entire sequence of characters
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: dlroW olleH

        // 7. length() - Getting the length of the StringBuffer
        System.out.println("Length of StringBuffer: " + sb.length()); // Output: 11

        // 8. capacity() - Getting the current capacity of the StringBuffer
        System.out.println("Capacity of StringBuffer: " + sb.capacity()); // Output: 27 (initial capacity + length)

        // 9. setCharAt() - Modifying a character at a specific index
        sb.setCharAt(0, 'D');
        System.out.println("After setCharAt: " + sb); // Output: DlroW olleH

        // 10. substring() - Extracting a portion of the StringBuffer (same as String's substring)
        String subStr = sb.substring(2, 7);
        System.out.println("Substring from index 2 to 7: " + subStr); // Output: roW o
    }


}