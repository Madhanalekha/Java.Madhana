/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author madha
 */
class Queue {
    private int item;
    private boolean available = false;
  
    public synchronized void produce(int item) {
        while (available) {
            try {
                wait(); 
            } catch (InterruptedException e) { }
        }
        this.item = item;  
        available = true;
        System.out.println("Produced: " + item);
        notify();  
    }

   
    public synchronized void consume() {
        while (!available) {
            try {
                wait();  
            } catch (InterruptedException e) { }
        }
        System.out.println("Consumed: " + item);
        available = false;
        notify(); 
    }
}


class Producer implements Runnable {
    private Queue queue;

    public Producer(Queue q) {
        this.queue = q;
        new Thread(this).start();  
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            queue.produce(i+1);           
        }
    }
}

class Consumer implements Runnable {
    private Queue queue;

    public Consumer(Queue q) {
        this.queue = q;
        new Thread(this).start();  
    }

  
    public void run() {
        for (int i = 0; i < 5; i++) {
            queue.consume();           
        }
    }
}

public class InterThreadcom {
    public static void main(String[] args) {
        Queue q = new Queue();  
        new Producer(q); 
        new Consumer(q); 
    }
}
