package collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(14);
        stack.push(11);
        System.out.println(stack);

        for(int i:stack){
            System.out.println(i);
        }


        System.out.println(stack.search(12));
        stack.pop();
        System.out.println(stack.peek());
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
