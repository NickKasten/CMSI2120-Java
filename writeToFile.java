import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class writeToFile {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;

        try {
            File sourceFile = new File(args[0]);
            File destinationFile = new File(args[1]);
            //Scanner scan = new Scanner(sourceFile);

            in = new FileReader(sourceFile);
            out = new FileWriter(destinationFile);

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
            out.close();

        } catch (FileNotFoundException fnf) {
            System.out.println(fnf.getLocalizedMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getLocalizedMessage());
        }
    }
}