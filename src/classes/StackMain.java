package classes;

public class StackMain {
    public static void main(String[] args) {
        Stack st1 = new Stack(10);

        for (int i = 1; i <= 11; i++) {
            st1.push(i * 4);
        }

        System.out.println(st1.pop());
        System.out.println(st1.pop());

        Stack st2 = new Stack(3);

        st2.push(3);
        st2.push(6);
        st2.push(9);

        System.out.println(st2.pop());
        System.out.println(st2.pop());
        System.out.println(st2.pop());
        System.out.println(st2.pop());

//        System.out.println(st1.tos);
    }
}
