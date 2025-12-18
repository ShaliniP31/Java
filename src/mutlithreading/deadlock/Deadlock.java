package mutlithreading.deadlock;

public class Deadlock implements Runnable{
    A a = new A();
    B b = new B();
    Thread t;

    Deadlock() {
        t = new Thread(this, "RacingThread");
    }
    @Override
    public void run() {
        b.first(a);
    }

    void deadlockStart(){
        t.start();
        a.first(b);
    }
}
