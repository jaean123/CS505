import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextWithoutAutoClose {
    public static void main(String[] args) {
        File file = new File("myfile.txt");
        boolean append = true;  // Set it to true to append to a file

        FileWriter fw = null;
        try {
            fw = new FileWriter(file, append);
            fw.write("write to a file\n");
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
        finally {
            if (fw != null) {
                try {
                    fw.close();
                }
                catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
