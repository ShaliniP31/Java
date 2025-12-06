package methods;

public class ArgumentPassingPrimitive {

    public static void main(String[] args) {
        int a = 10;

        System.out.println(a);
        System.out.println(test(a));
        System.out.println(a);
    }

    public static int test(int a){
        return a + 10;
    }
}
