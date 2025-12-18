package mutlithreading;

public class NewThreadThread extends Thread{

    NewThreadThread(String name) {
        super(name);
        System.out.println("Thread created: " + this.getName());
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(this.getName() + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(this.getName() + " interrupted.");
        }
        System.out.println("Exiting thread: " + this.getName());
    }
}
