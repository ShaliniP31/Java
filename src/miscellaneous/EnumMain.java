package miscellaneous;

public class EnumMain {
    public static void main(String[] args) {
        Apple ap = Apple.Cortland;
        System.out.println(ap);

        System.out.println(ap == Apple.RedSap);

        switch (ap) {
            case Jonathan:
                System.out.println(Apple.Jonathan);
                break;
            case Cortland:
                System.out.println(Apple.Cortland);
                break;
            default:
                System.out.println("Other apple variety");
        }

        System.out.println(Apple.valueOf("GoldenDel"));

        System.out.println("\n\nApples List:");
        for (Apple a : Apple.values()) {
            System.out.println(a);
        }

        System.out.println("\nApple2");
        System.out.println(Apple2.RedSap.getPrice());

        for (Apple2 a : Apple2.values()) {
            System.out.println(a + ": " + a.getPrice());
        }


        Apple ap1, ap2, ap3;

        ap1 = Apple.Jonathan;
        ap2 = Apple.RedSap;
        ap3 = Apple.Cortland;

        System.out.println(ap1.ordinal());
        System.out.println(ap3.ordinal());

        System.out.println(ap1.compareTo(ap2));
        System.out.println(ap2.compareTo(ap3));
        System.out.println(ap1 == ap3);


        Answers ans = Answers.NO;
        switch (ans) {
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case NEVER:
                System.out.println("Never");
                break;
            default:
                System.out.println("Maybe");
                break;
        }
    }
}
