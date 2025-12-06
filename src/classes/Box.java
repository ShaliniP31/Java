package classes;

public class Box {
    double width;
    double height;
    double depth;

    void displayVolume(){
        double volume = height * width * depth;
        System.out.println("Volume is " + volume);
    }

    double calculateVolume() {
        return width * height * depth;
    }
}
