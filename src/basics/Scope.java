package basics;

public class Scope {
    //Demonstrate block scope
    public static void main(String[] args) {
        int x = 10;
        if (x == 10) {
            //new scope started
            int y = 20;
            System.out.println("Initial x and y: " + x + " " + y);
            x = y * 2;
            System.out.println("Updated x and y: " + x + " " + y);
        }
        //y = 100; //Error
        System.out.println("x is: " + x);
    }
}
