import java.io.File;
import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) throws Exception {
        File file = new File("myfile.txt");

        // Open resource for reading
        Scanner input = new Scanner(file);

        // Read and print each line on the text file
        while (input.hasNext()) {
            String line = input.nextLine();
            System.out.println(line);
        }

        // Close resource
        input.close();
    }
}
