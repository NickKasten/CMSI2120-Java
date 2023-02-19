import java.util.Arrays;

public class notOnMenuException extends Exception {
    // declare
    private String msg = "That isn't on our menu! Perhaps you need a refresher as to what we do serve:";
    // instantiate
    private String[] menu;
    notOnMenuException() {
    }

    notOnMenuException(String[] userMenu) {
        this.menu = userMenu;
    }

    public void printMessage() {
        System.out.println(msg);
        System.out.println(Arrays.toString(menu));
    }
}
