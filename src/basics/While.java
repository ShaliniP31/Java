package basics;

public class While {
    public static void main(String[] args) {
        int num = 10;
        while (num > 0) {
            System.out.println("tick");
            num--;
        }

        int i = 100, j = 200;
        while (++i < --j) ;
        System.out.println("Midpoint is " + i + " " + j);
    }
}
