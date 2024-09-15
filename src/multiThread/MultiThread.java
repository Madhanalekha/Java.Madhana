/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiThread;

class ThreadOne extends Thread {
    public ThreadOne(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " (Priority: " + getPriority() + ") has started.");
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " is calculating: " + (i * 10));
                Thread.sleep(500); 
            }
        } catch (InterruptedException e) {}
        System.out.println(getName() + " has finished.");
    }
}

class ThreadTwo extends Thread {
    public ThreadTwo(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " (Priority: " + getPriority() + ") has started.");
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " is printing message " + i);
                Thread.sleep(700); 
            }
        } catch (InterruptedException e) {}
        System.out.println(getName() + " has finished.");
    }
}

class ThreadThree extends Thread {
    public ThreadThree(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " (Priority: " + getPriority() + ") has started.");
            for (int i = 3; i >= 1; i--) {
                System.out.println(getName() + " is counting down: " + i);
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {}
        System.out.println(getName() + " has finished.");
    }
}


public class MultiThread {
    public static void main(String[] args) {
        
        System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
        ThreadOne thread1 = new ThreadOne("Thread-1", Thread.MIN_PRIORITY);
        ThreadTwo thread2 = new ThreadTwo("Thread-2", Thread.NORM_PRIORITY);
        ThreadThree thread3 = new ThreadThree("Thread-3", Thread.MAX_PRIORITY);

       
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            
            System.out.println("Thread-1 is alive: " + thread1.isAlive());
            System.out.println("Thread-2 is alive: " + thread2.isAlive());
            System.out.println("Thread-3 is alive: " + thread3.isAlive());

            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {}

        
        System.out.println("All threads have finished execution.");
    }
}
