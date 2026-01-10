package concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class IncThread implements Runnable {
    String name;
    Semaphore sem;

    IncThread(Semaphore s, String n) {
        sem = s;
        name = n;
    }

    @Override
    public void run() {
        System.out.println("Starting " + name);
        try {
            System.out.println(name + " is waiting for permit");
            sem.acquire();
            System.out.println(name + " gets a permit");

            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + " : " + Shared.count);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(name + " release the permit");
        sem.release();
    }
}
