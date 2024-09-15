/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiThread;

class Buffer {  
    private int data;  
    private boolean hasData = false;  
    public synchronized void put(int value) {  
    while (hasData) {  
       try { wait(); }  
       catch (InterruptedException e) {  
       Thread.currentThread().interrupt();  
       } 
     } 
    data = value; 
    hasData = true;  
    System.out.println("Produced: " + value);  
    notify(); 
    }  
   public synchronized int get() {  
    while (!hasData) {  
  
    try { wait(); }  
    catch (InterruptedException e) {  
    Thread.currentThread().interrupt();  
    }  
    }  
    hasData = false; 
    System.out.println("Consumed: " + data); 
    notify(); 
    return data;  
    } 
 }  
class Producer extends Thread {  
   private Buffer buffer;  
   public Producer(Buffer buffer) {  
      this.buffer = buffer; }  
   public void run() {  
     for (int i = 1; i <= 5; i++) {  
        buffer.put(i); 
        try { Thread.sleep(1000); }  
        catch (InterruptedException e) {  
        Thread.currentThread().interrupt();  
        } 
      }  
    } 
}  
class Consumer extends Thread {  
    private Buffer buffer;  
    public Consumer(Buffer buffer) {  
      this.buffer = buffer; }  
    public void run() {  
       for (int i = 1; i <= 5; i++) {  
         buffer.get(); 
         try { Thread.sleep(1500); }  
         catch (InterruptedException e) {  
           Thread.currentThread().interrupt();  
         } 
        }  
    }  
}  
public class ProducerConsumer {  
public static void main(String[] args) { 
    System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
    Buffer buffer = new Buffer();  
    new Producer(buffer).start(); 
    new Consumer(buffer).start();  
    }  
}