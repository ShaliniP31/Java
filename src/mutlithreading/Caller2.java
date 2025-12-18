package mutlithreading;

public class Caller2 implements Runnable {
    Thread t;
    String msg;
    Callme2 call;

    Caller2(Callme2 call, String msg) {
        t = new Thread(this);
        this.msg = msg;
        this.call = call;
    }


    @Override
    public void run() {
        synchronized (call) {
            call.call(msg);
        }
    }
}
