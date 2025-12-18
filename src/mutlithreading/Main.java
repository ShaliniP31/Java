package mutlithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //With Runnable
        NewThreadRunnable nt = new NewThreadRunnable("Demo Thread 1");
        nt.t.start();

        NewThreadRunnable nt2 = new NewThreadRunnable("Demo Thread 2");
        nt2.t.start();

        //With Thread
        NewThreadThread ntt = new NewThreadThread("Demo Thread 3");
        ntt.start();

        NewThreadThread ntt2 = new NewThreadThread("Demo Thread 4");
        ntt2.start();

        ntt2.join();

        System.out.println(Thread.currentThread());


        Callme call = new Callme();
        Caller c1 = new Caller(call, "Hello");
        Caller c2 = new Caller(call, "World");
        Caller c3 = new Caller(call, "of");
        Caller c4 = new Caller(call, "Java");

        c1.t.start();
        c1.t.join();
        c2.t.start();
        c2.t.join();
        c3.t.start();
        c4.t.start();

        Callme2 call2 = new Callme2();
        Caller2 c21 = new Caller2(call2, "Hello");
        Caller2 c22 = new Caller2(call2, "World");
        c21.t.start();
        c21.t.join();
        c22.t.start();

        System.out.println("Bye");


    }
}

