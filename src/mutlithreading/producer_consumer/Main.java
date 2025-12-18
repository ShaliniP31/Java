package mutlithreading.producer_consumer;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.t.start();
        c.t.start();

        System.out.println("Press Control-C to stop.");
    }
}
