package exceptions;

public class TryCatch {
    public static void main(String[] args) {
        int a, d;
        try {
            d = 0;
            a = 30 / d;
            System.out.println("This will not be printed.");
        } catch (ArithmeticException e) {
            System.out.println("Exception is caught: " + e);
        }
        System.out.println("After try-catch block.");
    }
}
