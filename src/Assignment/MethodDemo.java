/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author madha
 */
class ThreadMethods extends Thread {

 
    
    public void run() {
        try {
          
            System.out.println(getName() + " is running.");
            Thread.sleep(1000);  
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }

        System.out.println(getName() + " was finished execution.");
    }
}
public class MethodDemo {
    public static void main(String[] args) {

        ThreadMethods t1 = new ThreadMethods();
        ThreadMethods t2 = new ThreadMethods();
        t1.setName("Thread1");
        t2.setName("Thread2");

        t1.setPriority(Thread.MIN_PRIORITY);  
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Thread Starting");
        t1.start();
        t2.start();

        try {
            t1.join();  
            t2.join();  
        } catch (InterruptedException e) { }


        System.out.println("Is Thread 1 alive? " + t1.isAlive());
        System.out.println("Is Thread 2 alive? " + t2.isAlive());

        System.out.println("Thread 1 Priority: " + t1.getPriority());
        System.out.println("Thread 2 Priority: " + t2.getPriority());

        System.out.println("All threads have finished.");
    }
}
