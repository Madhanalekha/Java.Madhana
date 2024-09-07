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
public class IfElseIf {
    public static void main(String[] args){
        System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
        Scanner scanner=new Scanner(System.in);
        System .out.println("Enter the number:");
        int number=scanner.nextInt();
        if(number>0)
        {
            System.out.println("The number is positive");
        }
        else if(number<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }
        scanner.close();
    }
}
