package modifiers.synchronizes;

class Main {

    public static void main(String[] args){
        Main x = new Main();
        x.Synchronized();
    }

    // Multithreaded programs may often have the problem where multiple threads try to access the same resource at
    // the same time and create problems.

    // Synchronized keyword provides only one thread can execute at a time.

    private void Synchronized(){
        // The program will always execute in the same order which is:
        // [1] T1 and [2] T2
        Sender send = new Sender();
        ThreadSend T1 = new ThreadSend("Hi", send);
        ThreadSend T2 = new ThreadSend("Bye", send);

        T1.start();
        T2.start();

        try {
            T1.join();
            T2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
