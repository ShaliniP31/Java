package mutlithreading;

public class NewThreadRunnable implements Runnable {
    Thread t;

    NewThreadRunnable(String name) {
        t = new Thread(this, name);
        System.out.println("Thread created: " + t.getName());
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(t.getName() + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(t.getName() + " interrupted.");
        }
        System.out.println("Exiting thread: " + t.getName());
    }
}
