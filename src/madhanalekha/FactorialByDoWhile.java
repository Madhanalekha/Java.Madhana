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
public class FactorialByDoWhile {
    public static void main(String[] args){
        System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
        Scanner scanner=new Scanner(System.in);
        System .out.println("Enter the number:");
        int number=scanner.nextInt();
        long factorial=1;
        int i=1;
        do{
            factorial*=i;
            i++;
        }while(i<=number);
        System.out.println("The factorial of "+number +" is "+factorial);
        scanner.close();
    }
}
