package modifiers.synchronizes;

class ThreadSend extends Thread{

    private String msg;
    private Sender sender;

    ThreadSend(String msg, Sender sender){
        this.msg = msg;
        this.sender = sender;
    }

    public void run(){
        sender.send(msg);
    }
}
