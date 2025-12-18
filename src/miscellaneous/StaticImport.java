package miscellaneous;

import static java.lang.Math.*;
public class StaticImport {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int c = (int)sqrt(pow(a, 2) + pow(b, 2));
        System.out.println(c);
    }
}
