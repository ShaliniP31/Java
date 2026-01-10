package lambda;

import java.util.function.*;

public class PreDefinedFunctionalInterfaces {
    public static void main(String[] args) {
        //Predicate<T> returns a boolean value
        Predicate<Integer> pred = (n) -> n % 2 == 0;
        System.out.println(pred.test(10));
        System.out.println(pred.test(11));

        //Function<T,R> takes 1 input T and returns value R
        Function<Integer, Integer> func = (n) -> {
            int res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        };
        System.out.println(func.apply(5));

        //BiFunction<T,R,U> takes 2 inputs T & R and returns U
        BiFunction<Integer, Integer, Integer> func2 = (a, b) -> a + b;
        System.out.println(func2.apply(10, 12));

        //Consumer<T> takes a value
        Consumer<String> cons = (s) -> System.out.println(s);
        cons.accept("Hello");

        //Supplier<T> returns a value
        Supplier<String> sup = () -> "Java";
        System.out.println(sup.get());

        //UnaryOperator<T> takes a value and returns value of same type
        UnaryOperator<Integer> square = x -> x*x;
        System.out.println(square.apply(10));

        //BinaryOperator<T> takes two values of same type and
        // returns value of same type
        BinaryOperator<Integer> multiply = (a, b) -> a*b;
        System.out.println(multiply.apply(122, 4));
    }


}
