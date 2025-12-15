package strings;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = new String("hello world");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1 == s2);
        System.out.println(" ==================== ");

        String s3 = "WorLD";
        System.out.println(s1.regionMatches(6, s3, 0, 5));
        System.out.println(s1.regionMatches(true, 6, s3, 0, 5));
        System.out.println(" ==================== ");

        System.out.println(s1.startsWith(s3));
        System.out.println(s1.endsWith(s3));

    }
}
