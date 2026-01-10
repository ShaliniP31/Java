package streams;

import java.util.HashMap;
import java.util.Map;

public class StreamFunctionsHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 1);
        map.put("Spring", 2);
        map.put("Lambda", 3);
        map.put("JavaScript", 4);
        map.put("HTML", 5);
        map.put("Jenkins", 6);

        map.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("\n");

    }
}
