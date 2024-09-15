/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;


public class LamdaExpression {
     public static void main(String[] args){
        Runnable  obj1=()->
                {
                 for(int i=1;i<=3;i++)
                 {
                     System.out.println("Hi");
                       try{ Thread.sleep(1000);} catch(Exception e){}
                 }
                }
                
                ;
        Runnable obj2 = ()->
                {
                 for(int i=1;i<=3;i++)
                 {
                     System.out.println("Hello");
                       try{ Thread.sleep(500);} catch(Exception e){}
                 }
                }
                ;
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        
        t2.start();
        
    }
}
}
