package classes;

public class InnerClass {
    int outer = 10;

    void print() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display(){
            System.out.println(outer);
        }
    }
}
