// import java.util.Scanner;
// import java.lang.NumberFormatException;

public class ListsMain {
    public static void main(String[] args) {
        MyCirLinkedList funnyList = new MyCirLinkedList();
        System.out.print("Is my list Empty?:");
        System.out.println(funnyList.isEmpty());
        System.out.print("How big is my list right now?:");
        System.out.println(funnyList.getSize());
        funnyList.add(54);
        funnyList.add(32);
        funnyList.add(98);
        System.out.print("Is my list Empty anymore?:");
        System.out.println(funnyList.isEmpty());
        System.out.print("How big is my list NOW?:");
        System.out.println(funnyList.getSize());
        System.out.println("");
        System.out.println("What's in the list Right Now?:");
        funnyList.printList();
        System.out.println("Inserted 33 before 32");
        funnyList.insertBefore(1, 33);
        funnyList.printList();
        System.out.println("Inserted 67 after 33");
        funnyList.insertAfter(1, 67);
        funnyList.printList();
        System.out.println("The index of 7 is:");
        System.out.println(funnyList.indexOf(7));
        System.out.println("Because 7 isnt in here!!!");




        MyDoublyLinkedList dlList = new MyDoublyLinkedList();
        System.out.println("********* DoublyLinkedList Time!!! *********");
        dlList.printList();
        System.out.println("///////");
        System.out.println("now printing our list with 3 strings");
        dlList.addNode("string1");
        dlList.addNode("string2");
        dlList.addNode("string3");
        dlList.printList();
        System.out.println("///////");
        System.out.println("now gonna attempt to add string1.5 before string2 and string2.5 after string2 ");
        dlList.insertBefore(1, "string1.5");
        dlList.insertAfter(2, "string2.5");
        dlList.printList();
        System.out.println("now let us get rid of the string at index 0! (not factorial)");
        dlList.removeNodeAt(0);
        System.out.println("did that work?:");
        dlList.printList();
        System.out.println("The index of string2.5 is:");
        System.out.println(dlList.indexOf("string2.5"));

        // Scanner myScan = new Scanner(System.in);
        // System.out.println("What type of list would you like?");
        // try {
        //     String input = myScan.nextLine();
        //     if (input.equals("CLL"))  {
                
        //         System.out.println("Enter your IDs to store");
        //         MyCirLinkedList userCLL = new MyCirLinkedList();
                
        //         boolean keepAsking = true;
        //         while (keepAsking) {
        //             String stringIds = myScan.nextLine();
        //             if (stringIds.equals("!!!")) {
        //                 keepAsking = false;
        //             } else {
        //             int ids = Integer.parseInt(stringIds);
        //             userCLL.add(ids);
        //             }
        //         }
        //         myScan.close();
        //         userCLL.printList();
        //         System.out.print("Index of 15 is:");
        //         System.out.println(userCLL.indexOf(15));
        //         userCLL.removeNodeAt(0);
        //         System.out.println("/////");
        //         userCLL.printList();

        //     } else if (input.equals("DLL")) {
                
        //         System.out.println("Enter your Strings to store");
        //         MyDoublyLinkedList userDLL = new MyDoublyLinkedList();
                
        //         while (true) {
        //             String userStrings = myScan.nextLine();
        //             if (userStrings.equals("!!!")) {
        //                 break;
        //             }
        //             userDLL.addNode(new Node(userStrings));
        //         }
        //         myScan.close();
        //         userDLL.printList();
        //         System.out.print("Index of Hello World! is");
        //         System.out.println(userDLL.indexOf("Hello World!"));
        //         userDLL.removeNodeAt(0);
        //         System.out.println("/////");
        //         userDLL.printList();   

        //     } else {
        //         Exception e = new Exception();
        //         myScan.close();
        //         throw e;            
        //     }
        // } catch (NumberFormatException nfe) {
        //     nfe.printStackTrace();
        // // } catch (Exception e) {
        //     System.out.println("We don't have those here! Here is your error stack:");
        //     e.printStackTrace();
    }
}

