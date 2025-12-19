package constructors;

public class UsingThis {
    int a;
    int b;

    UsingThis(int i, int j) {
        a = i;
        b = j;
    }

//    UsingThis(int i) {
//        a = i;
//        b = i;
//    }
//
//    UsingThis() {
//        a = 0;
//        b = 0;
//    }

    UsingThis(int i) {
        this(i, i);
    }

    UsingThis() {
        this(0);
    }
}
