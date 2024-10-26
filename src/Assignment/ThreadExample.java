/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author madha
 */
 class ThreadExample extends Thread {
    private String threadName;

    public ThreadExample(String name) {
        this.threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 2; i++) {
            try {
        
                System.out.println(threadName + " is running, iteration: " + i);
                
                Thread.sleep(500);
            } catch (InterruptedException e) { }
        }
        System.out.println(threadName + " has finished execution.");
    }

    public static void main(String[] args) {      
        ThreadExample thread1 = new ThreadExample("Thread 1");
        ThreadExample thread2 = new ThreadExample("Thread 2");
        ThreadExample thread3 = new ThreadExample("Thread 3");

  
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
