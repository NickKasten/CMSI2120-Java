import java.util.Scanner;

public class Teacher implements Speaker {

    public void speak() {
        System.out.println("Alright Class, today we will be covering Graphs! True or False: Forests are connected graphs without cycles.");
        Scanner myScan = new Scanner(System.in);
        String answer = myScan.nextLine();
        // have to leave the stream open for MoodWeatherMan!
        // myScan.close();

        if (answer.equalsIgnoreCase("True") || answer.equalsIgnoreCase("t")) {
            System.out.println("Wrong! Forests are unconnected graphs without cycles, while Trees are connected without cycles!");
        } else if (answer.equalsIgnoreCase("False") || answer.equalsIgnoreCase("f")) {
            System.out.println("Correct! Nice job!");
        } else {
            System.out.println("This is True or False silly!");
        }
        
    }

    public void announce( String str ) {
        System.out.printf("Hi there %s, let me grab your grade for you!", str);
        System.out.println();
        System.out.println("Wow, from what it looks like you have a 100%! Nice job!");
    }
}
