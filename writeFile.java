import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class writeFile {
    public static void main(String[] args) {

        // declaring the properties
        String in = null;
        FileWriter out = null;
        
        String ourArgs = null;

        for (int a = 0; a < args.length; a++) {
            ourArgs = ourArgs + args[a];
        }


        try {
            // assigning the input (first part of args) to in
            in = ourArgs;
            // assigning the pathway for copying to out
            out = new FileWriter("newfile.txt");
        
            int c;


            while ((c=in.read()) != -1) {
                out.write(c);
            }
        } catch (InputMismatchException ime) {
            System.out.println(ime);
        } catch (FileNotFoundException fnf) {
            System.out.println(fnf);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}