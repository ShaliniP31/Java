package collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(5);
        ll.add(6);
        ll.addFirst(3);
        ll.addLast(4);
        System.out.println(ll);

        ll.remove(2);
        ll.removeLast();
        System.out.println(ll);

        System.out.println(ll.getFirst());

        ll.set(3, 7);
        System.out.println(ll);

        System.out.println(ll.peek());
        System.out.println(ll);
    }
}
