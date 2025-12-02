package operators;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        System.out.println("Enter text");
        String val = sc.next();

        String str = val.startsWith("Wo") ? val : "Hello";
        System.out.println("Entered text " + str);
    }
}
