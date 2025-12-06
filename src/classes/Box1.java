package classes;

public class Box1 {

    double width;
    double height;
    double depth;

    Box1(int w, int h, int d){
        width = w;
        height = h;
        depth = d;
    }

    double calculateVolume() {
        return width * height * depth;
    }
}
