package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyFiles {
    public static void main(String[] args) {
        try {
            Path src = Path.of("D:\\Study\\Code\\Java\\src\\resources\\text1.txt");
            Path dest = Path.of("D:\\Study\\Code\\Java\\src\\resources\\nio_copy\\text1.txt");
            Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
