/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author madha
 */
import java.util.Scanner;
public class ExceptionClasss {
   
public static void main(String[] args){
    /*int a=10,b=0;
    int c=0;
    try {
        int arr[]=null;
        System.out.println(arr[1]);// here it will check this only and goto catch and but did not check the another option presenthere
        c=a/b;
        throw new NullPointerException("demo");
}
    catch(ArithmeticException e ){ //to put (ArithmeticEXception e) for arithmetic operators
    
        System.err.println("Error occured"); //to print the message in red color
    }
    catch(NullPointerException e){
        System.out.println("Null pointer Exception Occured");
    }
    finally{
    System.out.println("End the program");
    }
    int i=0;
    try(Scanner scanner=new Scanner(System.in))//try with resourse
    {
        i=scanner.nextInt();
    }*/
    //System.out.println(i);
    
    double bal=500,withdraw=700;
    try{
        if(bal<withdraw)
        throw new InsufficientFundException(withdraw-bal);
    }
    catch(InsufficientFundException e){
        System.out.println("Not enought money");
    }

}
    
}
