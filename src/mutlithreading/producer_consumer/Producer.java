package mutlithreading.producer_consumer;

public class Producer implements Runnable {
    Queue q;
    Thread t;

    Producer(Queue q) {
        this.q = q;
        t = new Thread(this, "Producer");
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
