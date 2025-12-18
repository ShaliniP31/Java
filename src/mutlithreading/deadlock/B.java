package mutlithreading.deadlock;

public class B {
    synchronized void first(A a) {
        System.out.println("In B.first()");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
        }

        a.last();
    }

    synchronized void last() {
        System.out.println("In B.last()");
    }
}
