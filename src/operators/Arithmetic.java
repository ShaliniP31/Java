package operators;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 10 + 5;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        int f = a % 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(e++);
        System.out.println(e);
        System.out.println(--e);
        System.out.println(e);
        System.out.println(f);

        System.out.println("\n\nDouble");
        double da = 10 + 5;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - da;
        double de = -dd;
        double df = da % 10;
        System.out.println(da);
        System.out.println(db);
        System.out.println(dc);
        System.out.println(dd);
        System.out.println(de);
        System.out.println(de++);
        System.out.println(de);
        System.out.println(--de);
        System.out.println(de);
        System.out.println(df);

    }
}
