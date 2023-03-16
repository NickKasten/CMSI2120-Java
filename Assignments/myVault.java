import java.util.ArrayList;
import java.util.Scanner;

public class myVault {
    public static void main(String[] args) {
        
        System.out.println("What would you like to store in the Vault (temporarily, of course):");
        ArrayList<String> userVault = new ArrayList<String>();
        Scanner myScan = new Scanner(System.in);
        String inputIntoVault = myScan.nextLine();
        userVault.add(inputIntoVault);
        System.out.println("Here is where your item was stored:");
        System.out.println(userVault);
        System.out.printf("Here is your %s, all nice and safe :) %n", inputIntoVault);
        System.out.println(userVault);

        ArrayList<String> logs = new ArrayList<>();
        boolean cond = true;
        while (cond) {
            System.out.println("Is there anything else you would like to add? (Y/N)");
            String choice = myScan.nextLine();
            if (choice.equals("Y")) {
                System.out.println("What would you like to add?");
                String userAddition = myScan.nextLine();
                userVault.add(userAddition);
            } else if (choice.equals("N")) {
                System.out.println("Thank you for choosing us, KickNasten&Co., to store your precious Strings!");
                cond = false;
            } else {
                System.out.printf("Sorry, we don't currently support that feature.%nIf you would like to have us add a feature in the future, let us know here:%n");
                String userComplaint = myScan.nextLine();
                System.out.printf("As a loyal patron of KickNasten&Co., your input matters most to us. %nIt has been added to our logs!%n");
                logs.add(userComplaint);
                System.out.printf("Your message, '%s', was definitely most certainly stored and kept and will be read by every staff member%n", userComplaint);
                logs.clear();
            }
        }

        System.out.println("Would you like to see the company log? (Y/N)");
            String choice = myScan.nextLine();
            if (choice.equals("Y")) {
                System.out.println(logs);
            } else if (choice.equals("N")) {
                System.out.println("Thank you for choosing us, KickNasten&Co., to store your precious Strings!");
            }

        System.out.println("Would you like to see your Strings one last time? (Y/N)");
        String decision = myScan.nextLine();
        if (decision.equals("Y")) {
            System.out.println(userVault);
            System.out.println("Bye bye, friends!");
        } else if (decision.equals("N")) {
            System.out.println("Thank you for choosing us, KickNasten&Co., to store your precious Strings!");
        }    

        myScan.close();
    }
    
}
