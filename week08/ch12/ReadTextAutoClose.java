import java.io.File;
import java.util.Scanner;

public class ReadTextAutoClose {
    public static void main(String[] args) throws Exception {
        File file = new File("myfile.txt");
        
        // The object within the () in the try-with-resources block must
        // implement AutoCloseable interface, which contains close() method. 
        // input.close() will be called whether or not an exception is thrown. 
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String line = input.nextLine();
                System.out.println(line);
            }
        }
    }
}
