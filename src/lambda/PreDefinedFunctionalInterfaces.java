package lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class PreDefinedFunctionalInterfaces {
    public static void main(String[] args) {
        Function<Integer, Integer> func = (n) -> {
            int res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        };

        System.out.println(func.apply(5));

        Predicate<Integer> pred = (n) -> n % 2 == 0;
        System.out.println(pred.test(10));
    }


}
