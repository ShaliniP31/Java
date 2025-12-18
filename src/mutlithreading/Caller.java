package mutlithreading;

public class Caller implements Runnable{
    Thread t;
    String msg;
    Callme call;

    Caller(Callme call, String msg) {
        t = new Thread(this);
        this.msg = msg;
        this.call = call;
    }


    @Override
    public void run() {
        call.call(msg);
    }
}
