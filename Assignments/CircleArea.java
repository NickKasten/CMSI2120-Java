import java.util.Scanner;

public class CircleArea { 
    private double radius;
    private double pi;
    
    CircleArea() {}

    public double area(double p, double r) {
        radius = r;
        pi = p;

        return p*r*r;
    }

    public static void main(String[] args) {
        // Scanner myScan = new Scanner(System.in);
        CircleArea circle = new CircleArea();
        
        System.out.println(circle.area(3.14, 4.0));
    }
}
