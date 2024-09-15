/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;

class Hi implements Runnable
{
    public void run(){
    for(int i=1;i<=3;i++)
    {
    System.out.println("Hi");
    try{ Thread.sleep(1000);} catch(Exception e){}
     }
    }
}
class Hello implements Runnable
{
    public void run(){
    for(int i=1;i<=3;i++)
    {
    System.out.println("Hello");
    try{ Thread.sleep(500);} catch(Exception e){}
}
    }
}
public class RunnableInterface {
     public static void main(String[] args)throws Exception{
        Runnable  obj1=new Hi();
        Runnable obj2 = new Hello();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.setName("HiThread");
        t2.setName("HelloThread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.getPriority());// 1to 10
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("bye");
        
        
        
    }
}
