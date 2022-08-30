package modifiers.synchronizes;

class Sender {

    // Can also make the send method sync:
        // public synchronized void send(String msg) { ... }
    public void send(String msg){

        // Only one thread at the time will execute the following code
        synchronized (this) {

            System.out.println("Sending [" + msg + "]");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Thread interrupted.");
            }

            System.out.println("Message Send");
        }
    }

}
