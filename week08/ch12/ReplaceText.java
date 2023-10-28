import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws Exception {
        // Check command lien parameter usage.
        if (args.length != 4) {
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        File targetFile = new File(args[1]);

        try (
            // Create input and output objects
            Scanner input = new Scanner(sourceFile);
            FileWriter output = new FileWriter(targetFile, false);
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[2], args[3]) + "\n";
                output.write(s2);
            }
        }
    }
}
