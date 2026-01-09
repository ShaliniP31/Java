package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClassesDemo {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Alpha");
        set1.add("Omega");
        set1.add("Beta");
        set1.add("Gamma");
        set1.add("Gamma");
        set1.add("Delta");
        set1.remove("Beta");
        System.out.println(set1.contains("Beta"));

        System.out.println(set1);

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Alpha");
        set2.add("Omega");
        set2.add("Beta");
        set2.add("Gamma");
        set2.add("Delta");
        System.out.println(set2);

        TreeSet<String> set3 = new TreeSet<>(new CustomComparator());
        set3.add("Alpha");
        set3.add("Omega");
        set3.add("Beta");
        set3.add("Gamma");
        set3.add("Delta");
        set3.first();
        System.out.println(set3);
    }
}
