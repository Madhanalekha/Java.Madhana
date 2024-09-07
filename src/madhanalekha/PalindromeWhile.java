/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package madhanalekha;

/**
 *
 * @author madha
 */
import java.util.Scanner;
public class PalindromeWhile {
    public static void main(String[] args){
        System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
        Scanner scanner=new Scanner(System.in);
        System .out.println("Enter the number:");
        int number=scanner.nextInt();
        int originalNumber=number;
        int reversedNum =0;
        int remain;
        while(number!=0)
        {
            remain=number%10;
            reversedNum =reversedNum*10+remain;
            number/=10;
            
        }
        if(originalNumber == reversedNum){
            System.out.println(originalNumber+" is palindrome.");
        }
        else{
            System.out.println(originalNumber+" is not palindrome.");
        }
        scanner.close();
    }
}
