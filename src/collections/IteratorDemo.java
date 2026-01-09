package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 4);
        list.add(5);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();

        ListIterator<Integer> litr = list.listIterator();
        while (litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println();
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
