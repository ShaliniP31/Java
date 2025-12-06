package methods;

public class Box {

    int height;
    int width;
    int depth;

    Box(int height, int width, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void calculate(Box box) {
        box.height /= 2;
        box.depth /= 3;
        box.width /= 4;
    }

    public void display() {
        System.out.println(height + " " + width + " " + depth);
    }

}
