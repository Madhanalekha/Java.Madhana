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
public class SumOfNumber {
    public static void main(String[] args){
        System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
        Scanner scanner=new Scanner(System.in);
        System .out.println("Enter the positive integer:");
        int n=scanner.nextInt();
        int sum=0;
        for(int i=1; i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum of the first "+n+" natural number is "+sum);
        scanner.close();
    }
}
