import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writeToFile {
    public static void main(String[] args) {
        //
        // boolean typing = true;
        FileWriter out = null;
        try {

            System.out.printf("Start typing what you would like to add to your file! %nType '!!!' to stop.%n");
            String fileContent = "";
            Scanner myScanner = new Scanner(System.in);

            // keep scanning the lines until there is a !!!
            String newInput;

            while (true) { 
                    newInput = myScanner.nextLine();
                    // why isnt it recognizing this?
                    //System.out.println("THIS IS NEW INPUT: " + newInput);
                    if (newInput.equals("!!!")) {
                        break;
                    } else {
                    //    System.out.println("THIS IS ELSE NEW INPUT: " + newInput);
                        
                        fileContent = fileContent + " " + newInput;
                    //    System.out.println("FILE CONTENT: " + fileContent);
                    }
            }

            System.out.println("What would you like to name the file?");
            String fileName = myScanner.nextLine() + ".txt";

            System.out.println("Your file " + fileName + " contains: " + fileContent);

            out = new FileWriter(fileName);
            out.write(fileContent);
            myScanner.close();
            out.close();

        } catch (FileNotFoundException fnf) {
            System.out.println(fnf.getLocalizedMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getLocalizedMessage());
        }
    }
}