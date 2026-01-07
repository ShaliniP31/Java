package input_output;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileReader fr = new FileReader("D:\\Study\\Code\\Java\\src\\resources\\text1.txt");
             FileWriter fw = new FileWriter("D:\\Study\\Code\\Java\\src\\resources\\text3.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write((char) c);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
