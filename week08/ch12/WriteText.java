import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteText {
    public static void main(String[] args) {
        File file = new File("myfile.txt");
        boolean append = true;  // Set it to true to append to a file

        try (FileWriter fw = new FileWriter(file, append)) {
            fw.write("write to a file\n");
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
