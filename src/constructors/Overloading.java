package constructors;

public class Overloading {

    int height;
    int length;

    Overloading() {
        this.length = -1;
        this.height = -1;
    }

    Overloading(int height) {
        this.height = height;
        this.length = height;
    }

    Overloading(int height, int length) {
        this.height = height;
        this.length = length;
    }

    Overloading(Overloading o){
        this.height = o.height;
        this.length = o.length;
    }

    public void display() {
        System.out.println(height * length);
    }
}
