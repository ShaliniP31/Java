package strings;

public class StringBasicOps {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.length());

        StringBasicOps bops = new StringBasicOps();
        System.out.println(bops);

        String s1 = "four: " + 2 + 2;
        System.out.println(s1);

        String s2 = "four: " + (2 + 2);
        System.out.println(s2);
    }

    @Override
    public String toString() {
        return "This is the Basic String Operation "  +
                "Practice class";
    }
}
