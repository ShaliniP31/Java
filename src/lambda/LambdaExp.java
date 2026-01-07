package lambda;

public class LambdaExp {
    public static void main(String[] args) {
        MyNum num;

        num = () -> 123.45;
        System.out.println(num.getValue());

        num = () -> Math.random() * 10;
        System.out.println(num.getValue());

        //Below will give error is the interface
        // method return type is not compatible.
//        num = () -> "Hello";


        NumericTest isEven;
        isEven = (n) -> n % 2 == 0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(15));


        NumericTest isPos;
        isPos = (n) -> n >= 0;
        System.out.println(isPos.test(10));
        System.out.println(isPos.test(-1));

        NumericTest2 isFactor;
        isFactor = (n, d) -> (n % d) == 0;
        System.out.println(isFactor.test(10, 7));
        System.out.println(isFactor.test(10, 5));

        NumericFunc fact = (n) -> {
            int value = 1;
            for (int i = 1; i <= n; i++) {
                value *= i;
            }
            return value;
        };

        System.out.println(fact.func(5));

        StringFunc reverse=(s) ->{
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        };
        System.out.println(reverse.func("Hello"));


        SomeFunc<Integer> fact1 = (n) -> {
            int value = 1;
            for (int i = 1; i <= n; i++) {
                value *= i;
            }
            return value;
        };
        System.out.println(fact1.func(5));

        SomeFunc<String> rev2 = (s) -> {
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        };
        System.out.println(rev2.func("Hello"));


        int m =10;
        fact1 =(n) ->{
            return m*n;
        };

//        m = 9;//cannot be modified as considered final because used in lambda expression.
    }
}
