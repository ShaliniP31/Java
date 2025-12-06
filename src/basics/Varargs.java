package basics;

public class Varargs {

    static int add(int... a) {
        System.out.println("length: " + a.length);
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        return sum;
    }

    static int add(float... a) {
        System.out.println("length: " + a.length);
        float sum = 0;
        for (float x : a) {
            sum += x;
        }
        return (int) sum;
    }

    static int add(String... a) {
        System.out.println("length: " + a.length);
        return 0;
    }

    static int addnmultiply(int d, int... a) {
        System.out.println("length: " + a.length);
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        return sum * d;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2, 3));
        System.out.println(add(5, 6));
//        System.out.println(add()); //error -> ambiguous call

        System.out.println(addnmultiply(10, 1, 2, 3));

        System.out.println(add(1.98f, 2.33f, 3.988f));
    }
}
