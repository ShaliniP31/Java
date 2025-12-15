package strings;

public class StringConstructors {
    public static void main(String[] args) {
        //Empty string
        String s1 = "";
        System.out.println(s1);

        char[] a = {'a', 'b', 'c', 'd', 'e'};
        String s2 = new String(a);
        System.out.println(s2);

        String s3 = new String(a, 2, 3);
        System.out.println(s3);

        String s4 = "Hello";
        System.out.println(s4);

        String s5 = "World";
        System.out.println(s5);


        byte[] ascii = {65, 66, 67, 68, 69, 70};

        String ss1 = new String(ascii);
        System.out.println(ss1);
        String ss2 = new String(ascii, 2, 3);
        System.out.println(ss2);


        //same works for StringBuilder
        StringBuffer sb = new StringBuffer("Hello World");
        sb.reverse();
        String ss3 = new String(sb);
        System.out.println(ss3);
    }
}
