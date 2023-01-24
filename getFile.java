import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class getFile {
    public static void main(String[] args) {

        File f = new File("testfile.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(f);  
        //
        } catch (FileNotFoundException e) {
            // Auto generated catch block
            e.printStackTrace();
            // instead of constructor InputStream, call constructor with data type File
        }

        while (scan.hasNextLine()) {
            String s = scan.nextLine();

            System.out.println(s);
        }
    }
}








///// FileInput/OutputStream is for byte stream (java byte code)


        //         try {
//             FileInputStream in = null;
//             FileOutputStream out = null;
//             in = new FileInputStream(args[0]);
//             out = new FileOutputStream(args[1]);

//             int c;
//             while ((c = in.read()) != -1) {
//                 out.write(c);
//             }
//         } catch (FileNotFoundException fnf) {
//             System.out.println("oopsies file not found");
//         } catch (IOException io) {
//             System.out.println("input output exception idk");
//         }

//     }
// }