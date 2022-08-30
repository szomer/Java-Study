package javaAPI.thread;

class Threads {

    // When multiple Threads access the same resources, problems can occur.
    // To prevent this we use synchronized, to allow only 1 Thread to execute the code at the time.

    public static void main(String[] args) {
        // Start Thread
        ThreadExample t1 = new ThreadExample();
        t1.start();

        // Start Runnable Thread
        ThreadExampleRunnable runnable = new ThreadExampleRunnable();
        Thread t2 = new Thread(runnable);
        t2.start();

        // Use .isAlive() to check if the thread is running
        while(t2.isAlive()) {
            System.out.println("Waiting...");
        }
    }
}

// Extend Thread class
class ThreadExample extends Thread {
    public void run(){
        System.out.println("This code is running in a thread");
    }

}

// Implement Runnable interface
// Because Runnable is an interface, we can extend another class or implement other interfaces
class ThreadExampleRunnable implements Runnable{
    public void run() {
        System.out.println("This code is running in a thread");
    }
}