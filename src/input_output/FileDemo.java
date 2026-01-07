package input_output;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f1 = new File("D:\\Study\\Code\\Java\\src\\resources\\text1.txt");
        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.exists());
        System.out.println(f1.isDirectory());
        System.out.println(f1.lastModified());
    }
}
