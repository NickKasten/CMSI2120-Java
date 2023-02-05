import java.util.Scanner;
import java.lang.NumberFormatException;

public class ListsMain {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("What type of list would you like?");
        try {
            String input = myScan.nextLine();
            if (input.equals("CLL"))  {
                
                System.out.println("Enter your IDs to store");
                MyCirLinkedList userCLL = new MyCirLinkedList();
                
                while (true) {
                    String stringIds = myScan.nextLine();
                    if (stringIds.equals("!!!")) {
                        break;
                    }
                    int ids = Integer.parseInt(stringIds);
                    userCLL.add(ids);
                }
                userCLL.printList();

            } else if (input.equals("DLL")) {
                
                System.out.println("Enter your Strings to store");
                MyDoublyLinkedList userDLL = new MyDoublyLinkedList();
                
                while (true) {
                    String userStrings = myScan.nextLine();
                    if (userStrings.equals("!!!")) {
                        break;
                    }
                    userDLL.addNode(new Node(userStrings));
                }
                userDLL.printList();   

            } else {
                Exception e = new Exception();
                throw e;            
            }
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        } catch (Exception e) {
            System.out.println("We don't have those here! Here is your error stack:");
            e.printStackTrace();
        }
    }
}
