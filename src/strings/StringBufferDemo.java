package strings;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.ensureCapacity(100);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        System.out.println(sb.charAt(8));
        sb.setCharAt(8, 'q');
        System.out.println(sb);
        sb.setLength(6);
        System.out.println(sb);
        sb.setLength(12);
        System.out.println(sb);

        sb.setLength(6);
        sb.append("World").append("!");
        System.out.println(sb);

        char[] ch = new char[5];
        sb.getChars(7, sb.length(), ch, 0);
        System.out.println(ch);

        StringBuffer sb1 = new StringBuffer("I Java.");
        sb1.insert(2, "10 ");
        System.out.println(sb1);

        sb.reverse();
        System.out.println(sb);

        sb.reverse();
        sb.delete(5, 7);
        System.out.println(sb);
        sb.deleteCharAt(6);
        System.out.println(sb);

        sb.replace(5, 8, " Java");
        System.out.println(sb);

        String s = sb.substring(6);
        System.out.println(s);
        s = sb.substring(6, 10);
        System.out.println(s);
    }
}
