package basics;

public class Casting {
    public static void main(String[] args) {
        byte b;
        int i =257;
        double d = 323.22;

        b = (byte) i;
        System.out.println("Byte value after casting integer: " + b);

        i = (int) d;
        System.out.println("Integer value after casting double: " + i);

        b = (byte) d;
        System.out.println("Byte value after casting double: " + b);

        /*
        When the value 257 is cast into a byte variable, the result is the
        remainder of the division of 257 by 256 (the range of a byte), which is 1 in this case.
        When the d is converted to an int, its fractional component is lost.
        When d is converted to a byte, its fractional component is lost, and the value is reduced
        modulo 256, which in this case is 67.
         */
    }
}
