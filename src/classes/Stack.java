package classes;

public class Stack {
    private int[] st;
    private int tos;

    Stack(int size) {
        st = new int[size];
        tos = -1;
    }

    void push(int i) {
        if (tos == st.length - 1) {
            System.out.println("Stack is full");
        } else {
            st[++tos] = i;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return st[tos--];
        }
    }
}
