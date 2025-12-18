package mutlithreading.producer_consumer;

public class Queue {
    int n;

//    Using below commented code, we can see producer putting the same value multiple time and
//    the consumer getting the same value multiple times.
//    synchronized int get() {
//        System.out.println("Got: " + n);
//        return n;
//    }
//
//    synchronized void put(int n) {
//        this.n = n;
//        System.out.println("Put: " + n);
//    }


    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        this.n = n;
        System.out.println("Put: " + n);
        valueSet = true;
        notify();
    }
}
