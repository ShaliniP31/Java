package streams;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(17);
        list.add(32);
        list.add(3);
        list.add(55);
        list.add(43);

        Stream<Integer> stream = list.stream();
        Optional<Integer> min = stream.min(Integer::compare);
        min.ifPresent(System.out::println);

        System.out.println(list.stream().max(Integer::compare).get());

        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted().filter((n) -> n % 2 == 0).forEach(System.out::println);

        list.stream().map((a) -> Math.sqrt(a)).forEach(System.out::println);
    }
}
