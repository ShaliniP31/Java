package basics;

public class StringBasics {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "World Wide Web";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.length());
        System.out.println(s2.charAt(3));
    }
}
