import java.util.ArrayList;
import java.util.Scanner;

public class myVault {
    public static void main(String[] args) {
        System.out.println("Please type what you would like to store in the vault:");
        ArrayList<String> userVault = new ArrayList<>();
        Scanner myScan = new Scanner(System.in);
        String inputIntoBank = myScan.nextLine();
        userVault.add(inputIntoBank);
        System.out.println(userVault.toString());
        myScan.close();
    }
    
}
