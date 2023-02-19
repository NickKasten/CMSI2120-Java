import java.util.Scanner;
import java.util.Arrays;

public class barista {
    public static String[] menu = {"Pink_Drink", "Caramel_Macchiato", "Chai_Latte", "Oat_Milk_Latte"};
    
    
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Hello, what would you like to order today?");
        String order = myScan.nextLine();
        myScan.close();
        try {
            notOnMenuException exc = new notOnMenuException(menu);
            if (Arrays.asList(menu).contains(order)) {
                System.out.printf("Your order was %s!!! %n", order);
            } else {
                throw exc;
            }

        } catch (notOnMenuException nome) {
            nome.printMessage();
        }

    }
}
