/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiThread;


 import java.util.Scanner;
public class MultipleExceptions {
  
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
        try {
            // 1. ArithmeticException 
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int result = 100 / number;
            System.out.println("Result: " + result);

            // 2. ArrayIndexOutOfBoundsException 
            int[] array = new int[3];
            array[0]=2;
            array[1]=5;
            array[2]=7;
            System.out.print("Enter an index to access (0-2): ");
            int index = scanner.nextInt();
            System.out.println("Array element at index " + index + ": " + array[index]);

            // 3. NumberFormatException 
            System.out.print("Enter a numeric string: ");
            String numericString = scanner.next();
                    
                    
            int parsedNumber = Integer.parseInt(numericString);
            System.out.println("Parsed number: " + parsedNumber);

        } catch (ArithmeticException e){
            System.out.println("ArithmeticException: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index.");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid format.");
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }

}
