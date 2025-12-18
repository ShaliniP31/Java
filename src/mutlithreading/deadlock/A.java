package mutlithreading.deadlock;

public class A {
    synchronized void first(B b) {
        System.out.println("In A.first()");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
        }

        b.last();
    }

    synchronized void last() {
        System.out.println("In A.last()");
    }
}
