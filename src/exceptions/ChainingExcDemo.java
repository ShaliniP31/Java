package exceptions;

public class ChainingExcDemo {
    //with methods
    static void demoproc() {
        NullPointerException e = new NullPointerException("top layer");
        e.initCause(new ArithmeticException("demo"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println(e.getCause());
        }

        int a, d = 0;
        try {
            a = 10 / d;
        } catch (ArithmeticException e) {
            throw new RuntimeException("value of d is 0", e);
        }
    }
}
