package exceptions;

import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 0 & 1: ");
        int d = sc.nextInt();
        int a = 0;
        int[] n = {10, 1};

        try {
            a = 10 / d;
            System.out.println(n[2]);
//        }catch (Exception e){
//        } catch (ArithmeticException e) {
//            System.out.println("Exception caught: " + e);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception caught: " + e);
//        }
            //multi-catch statement
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("After catch block: " + a);
    }
}
