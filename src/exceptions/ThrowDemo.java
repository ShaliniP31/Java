package exceptions;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e);
        }
    }

    public static void demoproc() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
            throw e;
        }
    }
}
