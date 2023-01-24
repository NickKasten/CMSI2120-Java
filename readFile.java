import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;

        in = new FileReader("input.txt");
        out = new FileWriter();

        int c;
        while ((c=in.read()) != -1) {
            out.write(c);
        }
    }
}