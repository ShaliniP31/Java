package strings;

public class CharExtraction {
    public static void main(String[] args) {
        String s = "Java Practice for Char Extraction";
        System.out.println(s.charAt(14));

        char[] buf = new char[8];
        s.getChars(5, 13, buf, 0);
        System.out.println(buf);

        char[] buf2 = s.toCharArray();
        System.out.println(buf2[14]);
    }
}
