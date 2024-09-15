/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;

class Hi extends Thread
{
    public void run(){
    for(int i=1;i<=3;i++)
    {
    System.out.println("Hi");
    try{ Thread.sleep(1000);} catch(Exception e){}
     }
    }
}
class Hello extends Thread
{
    public void run(){
    for(int i=1;i<=3;i++)
    {
    System.out.println("Hello");
    try{ Thread.sleep(500);} catch(Exception e){}
}
    }
}
public class MultiTheadingDemo1 {
    public static void main(String[] args){
        Hi obj1=new Hi();
        Hello obj2 = new Hello();
        obj1.start();
        obj2.start();
        
    }
}
