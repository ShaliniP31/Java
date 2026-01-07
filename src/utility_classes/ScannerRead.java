package utility_classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerRead {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("D:\\Study\\Code\\Java\\src\\resources\\text1.txt");
        Scanner sc = new Scanner(fr);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

        sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
    }
}
