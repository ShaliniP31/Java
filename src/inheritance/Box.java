package inheritance;

public class Box {

    int width;
    int height;
    int depth;

    Box() {
    }

    Box(int height, int width, int depth) {
        this.height = height;
        this.depth = depth;
        this.width = width;
    }

    int calculateVolume() {
        return height * width * depth;
    }
}
