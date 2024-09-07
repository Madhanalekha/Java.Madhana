/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package madhanalekha;

import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args){
        System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        if(number%2==0){
            System.out.println("The number "+number+" is even");
        }
        else{
             System.out.println("The number "+number+" is odd");
        }
        scanner.close();
    }
    
}
