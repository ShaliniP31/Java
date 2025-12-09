package inheritance;

public class BoxWeight extends Box {

    int weight;

//    BoxWeight(int height, int width, int depth, int weight) {
//        this.height = height;
//        this.depth = depth;
//        this.width = width;
//        this.weight = weight;
//    }

    BoxWeight(int height, int width, int depth, int weight) {
        super(height, width, depth);
        this.weight = weight;
    }
}
