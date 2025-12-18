package mutlithreading;

public class Callme2 {
    public void call(String msg) {
        try {
            System.out.print("[");
            System.out.print(msg);
            Thread.sleep(2000);
            System.out.print("]");
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted");
        }
    }
}
