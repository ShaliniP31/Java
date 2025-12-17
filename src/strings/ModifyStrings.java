package strings;

public class ModifyStrings {
    public static void main(String[] args) {
        String s = "Now is the time for all good men " +
                "to come to the aid of their country.";
        System.out.println(s.substring(10));
        System.out.println(s.substring(10, 30));

        String s1 = "one";
        String s2 = s1.concat(" two");
        System.out.println(s2);

        System.out.println(s.replace('t', 'g'));
        System.out.println(s);

        int num = 10;
        System.out.println(String.valueOf(num));

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(String.join(":", "Alpha", "Beta", "Gamma"));
    }
}
