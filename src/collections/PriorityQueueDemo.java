package collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(10);
        pq1.add(20);
        pq1.add(12);
        pq1.add(19);
        pq1.add(200);
        System.out.println(pq1);
        System.out.println(pq1.contains(19));

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        pq2.add(10);
        pq2.add(20);
        pq2.add(12);
        pq2.add(19);
        pq2.add(2);
        System.out.println(pq2);

    }
}
