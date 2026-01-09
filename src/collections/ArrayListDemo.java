package collections;

import lambda.SomeFunc;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 4);
        list.add(5);

        list.set(3, 6);
        System.out.println("Size:" + list.size());

        System.out.println("List elements:");
        System.out.println(list);
        list.remove(3);


        Integer[] a1 = new Integer[list.size()];
        a1 = list.toArray(a1);

        System.out.println("Array elements:");
        for(int i: a1){
            System.out.println(i);
        }
        System.out.println(list.contains(1));

        ArrayList<Integer> i1 = new ArrayList<>();
        i1.add(1);
        i1.add(2);
        i1.add(3);
        i1.add(4);

        ArrayList<Integer> i2 = new ArrayList<>();
        i2.add(5);
        i2.add(2);
        i2.add(3);
        i2.add(4);

//        System.out.println("All Elements");
//        ArrayList<Integer> i3 = new ArrayList<>(i1);
//        i3.removeAll(i2);
//        System.out.println(i3);

        System.out.println("Intersection/Common Elements");
        ArrayList<Integer> i3 = new ArrayList<>(i1);
        i3.retainAll(i2);
        System.out.println(i3);

    }
}
