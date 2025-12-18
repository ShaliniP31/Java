package mutlithreading;

public class Callme {
    //    public void call(String msg) {
    synchronized public void call(String msg) {
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
