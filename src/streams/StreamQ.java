package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamQ {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(13, 52, 31, 24, 85, 46);
        List<String> strs = Arrays.asList("Java", "Spring", "Lambda", "JavaScript", "HTML", "Java", "Jenkins");

        System.out.println("\n1. Filter Even Numbers from a List");
        List<Integer> ans = nums.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(ans);

        System.out.println("\n2. Find maximum in a List");
        Optional<Integer> optN = nums.stream().max(Integer::compareTo);
        optN.ifPresent(System.out::println);

        System.out.println("\n3. Sort a List");
        ans = nums.stream().sorted().toList();
        System.out.println(ans);

        System.out.println("\n4. Count Strings with Specific Prefix");
        long value = strs.stream().filter(s -> s.startsWith("J")).count();
        System.out.println(value);

        System.out.println("\n5. Find the first non-repeated character in a string.");
        String s = "swiss";
        Optional<Character> optC = s.chars().mapToObj(c -> (char) c).filter(c -> s.indexOf(c) == s.lastIndexOf(c))
                .findFirst();
        System.out.println(optC.orElse(null));

        System.out.println("\n6. Convert List of Strings to Uppercase");
        List<String> ansS = strs.stream().map(String::toUpperCase).toList();
        System.out.println(ansS);

        System.out.println("\n7. Sum of Numbers in a List");
        int i = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(i);

        System.out.println("\n8. Check if Any String Matches a Condition");
        boolean b = strs.stream().anyMatch(s1->s1.contains("Script"));
        System.out.println(b);

    }
}
