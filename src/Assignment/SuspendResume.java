



package Assignment;


class MyThread implements Runnable {
    private Thread thread;
    private boolean suspended = false; 
    public MyThread(String name) {
        thread = new Thread(this, name);
        thread.start(); 
    }

    synchronized void suspendThread() {
        suspended = true;
    }

    synchronized void resumeThread() {
        suspended = false;
        notify();  
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(thread.getName() + " : " + i);
                Thread.sleep(500);  
                synchronized (this) {
                    while (suspended) {
                        wait();                     
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " was interrupted.");
        }

        System.out.println(thread.getName() + " has finished execution.");
    }
}

public class SuspendResume {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("MyThread");

        try {
            
            Thread.sleep(2000);

            System.out.println("Suspending the thread...");
            myThread.suspendThread();

            Thread.sleep(3000);

            System.out.println("Resuming the thread...");
            myThread.resumeThread();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }
    }
}
