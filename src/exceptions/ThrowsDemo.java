package exceptions;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            demoproc();
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void demoproc() throws IllegalAccessException {
        throw new IllegalAccessException("demo");
    }
}

