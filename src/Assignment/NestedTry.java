/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author madha
 */
public class NestedTry {
    public static void main(String args[]) {
        

        try {                     
            System.out.println("Outer try block ");
           try{
               
            int a=100;
            int b = 0;
            System.out.println("Inner try block");  
            int result = a / b;
           }catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " );
           }
           
            try {
                System.out.println("Inner try block2");               
                int[] arr = new int[3];               
                arr[5] = 25;                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught Array Exception " );
            }

        } catch (Exception e) {
            System.out.println("Caught Exception inouter catch block" );
          
        }

        System.out.println("Program ended.");
    }
   
    
}
