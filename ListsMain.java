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
                myScan.close();
                userCLL.printList();
                System.out.print("Index of 15 is:");
                System.out.println(userCLL.indexOf(15));
                userCLL.removeNodeAt(0);
                System.out.println("/////");
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
                myScan.close();
                userDLL.printList();
                System.out.print("Index of Hello World! is");
                System.out.println(userDLL.indexOf("Hello World!"));
                userDLL.removeNodeAt(0);
                System.out.println("/////");
                userDLL.printList();   

            } else {
                Exception e = new Exception();
                myScan.close();
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
