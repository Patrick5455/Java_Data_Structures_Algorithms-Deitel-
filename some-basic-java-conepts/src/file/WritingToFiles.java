package file;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFiles {

    /*
     * There are various ways to work with file in Java:
     * 1. We can use PrintWriter to write to file
     * 2. We cna also use the BufferReader
     * */

    public static void main(String... args) {

        File file = new File("testJavaFile.txt");
        PrintWriter print;

        try {

            if (!file.exists()) {
                file.createNewFile();
                print = new PrintWriter(file);
                print.println("@ Author Patrick Ojunde \nThis is a file created by Java");
                print.println(10000);

                //close File
                print.close();
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}