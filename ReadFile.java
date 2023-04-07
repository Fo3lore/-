package mypackage;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:/Users/nikit/Desktop/tst.txt";
        File file = new File(path);
        
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}