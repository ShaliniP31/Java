package datatypes;

public class Area {
    /*
    Program to compute the area of a circle.
    This program shows the use of double datatype and float datatype.
     */

    public static void main(String[] args) {
        inFloat();
        inDouble();
    }

    public static void inFloat() {
        float pi, r, a;
        r = 10.8f;
        pi = 3.1416f;
        a = pi * r * r;

        System.out.println("Area of circle is " + a);
    }

    public static void inDouble() {
        double pi, r, a;
        r = 10.8;
        pi = 3.1416;
        a = pi * r * r;

        System.out.println("Area of circle is " + a);
    }
}
