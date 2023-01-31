import java.util.ArrayList;
import java.util.Scanner;

public class myVault {
    public static void main(String[] args) {
        System.out.println("What would you liek to store in the Vault (temporarily, of course):");
        ArrayList<String> userVault = new ArrayList<String>();
        Scanner myScan = new Scanner(System.in);
        String inputIntoVaul = myScan.nextLine();
        userVault.add(inputIntoVaul);
        System.out.println(userVault.toString());
        myScan.close();
    }
    
}
