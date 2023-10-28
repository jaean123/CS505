import java.io.File;
import java.util.Scanner;

public class ReadTextAutoClose {
    public static void main(String[] args) throws Exception {
        File file = new File("myfile.txt");

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String line = input.nextLine();
                System.out.println(line);
            }
        }
    }
}
