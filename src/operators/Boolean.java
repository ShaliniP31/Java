package operators;

public class Boolean {
    public static void main(String[] args) {
        int i = 10, j = 0;

        //Short circuit operators
        if (j != 0 && i % j == 2) {
            System.out.println("Hello");
        }

        System.out.println("World");

        if (j != 0 & i % j == 2) {
            System.out.println("Hello");
        }
    }
}
