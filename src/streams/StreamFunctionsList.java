package streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFunctionsList {
    public static void main(String[] args) {
        String[] str = {"Java", "Spring", "Lambda", "JavaScript", "HTML", "Jenkins"};
        //Use List<T> for Arrays.asList()
        List<String> list = Arrays.asList(str);
        Integer[] ints = {1, 2, 2, 3, 4, 5, 4, 5};
        List<Integer> nums = Arrays.asList(ints);

        System.out.println("Print each element in list - ");
        list.forEach(System.out::println);

        System.out.println("\nFiltering list elements");
        list.stream().filter((s) -> s.startsWith("J"))
                .forEach(System.out::println);

        System.out.println("\nSorting list elements - ascending");
        list.stream().sorted().forEach(System.out::println);

        System.out.println("\nSorting list elements - descending");
        list.stream().sorted(Collections.reverseOrder())
                .forEach(System.out::println);

        System.out.println("\nSorting list elements - length of string");
        list.stream().sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);

        System.out.println("\nJoining without delimiter");
        String s = list.stream().collect(Collectors.joining());
        System.out.println(s);

        System.out.println("\nJoining with delimiter");
        s = list.stream().collect(Collectors.joining(" "));
        System.out.println(s);

        System.out.println("\nConvert List to Map");
        Map<String, Integer> map = list.stream().collect(Collectors
                .toMap(m->m, String::length));
        map.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("\nConvert to Uppercase");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("\nFilter elements");
        list.stream().filter(s1 -> s1.length()>5)
                .forEach(System.out::println);

        System.out.println("\nDistinct elements");
        nums.stream().distinct().forEach(System.out::println);

        System.out.println("\nCount elements");
        System.out.println(nums.stream().count());
        System.out.println(nums.stream().distinct().count());

        System.out.println("\nCheck if value exists");
        //Even if 1 element matches
        System.out.println(list.stream().anyMatch(s1->s1.equals("Java")));
        //All elements should match
        System.out.println(list.stream().allMatch(s1->s1.equals("Java")));
        //No elements match
        System.out.println(list.stream().noneMatch(s1->s1.equals("Java")));

        System.out.println("\nCollect to Set");
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        set.forEach(System.out::println);

        System.out.println("\nSum of elements");
        System.out.println(nums.stream().mapToInt(Integer::intValue).sum());

        System.out.println("\nMax/Min of elements");
        System.out.println(nums.stream().mapToInt(Integer::intValue).max());
        System.out.println(nums.stream().max(Integer::compareTo));
    }
}
