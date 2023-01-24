import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;
// self-made exception
//import java.rangeException;

public class Grades {
    
    // grades and numberOfGrades are static so they can be accessed in the main method
    private static int[] grades;
    private int highest;
    private int lowest;
    private static int numberOfGrades;

    // use the constructor to make their values?
    Grades () {
        highest = grades[(grades.length-1)];
        lowest = grades[0];
    }


    public static void setGrades(int[] myArray) {
        grades = myArray;
    }
    
    public int[] getGrades() {
        return grades;
    }

    public int getHighest() {
        Arrays.sort(grades);
        return this.highest;
    }

    public int getLowest() {
        Arrays.sort(grades);
        return this.lowest;
    }

    public int getNumberOfGrades() {
        return numberOfGrades;
    }
    
    public double getAverage() {
        double sum = 0.0;
        if (grades.length == 0) {
            double average = sum;
            return average;
        } else {
            for (int i = 0; i < grades.length; i++) {
                sum = sum + grades[i];
            }
            return (sum/grades.length);
        }
    }

    public int failingGrades(int failingMark) {
        int counter = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < failingMark) {
                counter ++;
            } 
        }
        return counter;
    }

    public void histogram() {
        // making vars for each of the grade "sections"
        int f = 0;
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 60) {
                f ++;
            } else if (grades[i] < 70) {
                d ++;
            } else if (grades[i] < 80) {
                c ++;
            } else if (grades[i] < 90) {
                b ++;
            } else if (grades[i] <= 100) {
                a ++;
            }
        }

        System.out.println("90 - 100 | ");
        for (int i = 1; i <= a; i++) {
            System.out.print("*");
        }
        System.out.println("80 - 89  | ");
        for (int i = 1; i <= b; i++) {
            System.out.print("*");
        }
        System.out.println("70 - 79  | ");
        for (int i = 1; i <= c; i++) {
            System.out.print("*");
        }
        System.out.println("60 - 69  | ");
        for (int i = 1; i <= d; i++) {
            System.out.print("*");
        }
        System.out.println("< 60     | ");
        for (int i = 1; i <= f; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        
        // making a Scanner object with the input (System.in) as the file directory
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the number of grades to input: ");
        
        // make the scanner read the next line
        String userInputGradesNum = myScanner.nextLine();
        // must make sure that if the input is not an integer that it can be parsed from the string that is gets dealt with
        try{
            numberOfGrades = Integer.parseInt(userInputGradesNum);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            return;
        }
        
        // Instantiating an array that is the size of the number of grades we have given it
        int[] userArray = new int[numberOfGrades];

        // for each grade, ask then put that input into the array
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.printf("Enter grade %d:", (i+1));

            rangeException re = new rangeException();
            // have the scanner's input get assigned to the userInputGrade variable
            String userInputGrade = myScanner.nextLine();
            // now lets TRY to just grab their stuff
            try{
                int userGrade = Integer.parseInt(userInputGrade);
                if (userGrade > 100) {
                    throw re;
                }
                userArray[i] = userGrade;
            } catch (NumberFormatException nfe) {
                nfe.printStackTrace();
                return;
            } catch (rangeException exc) {
                System.out.println(exc.getMessage());
                return;
            }
        }

        System.out.println(Arrays.toString(userArray));
        // call the setter to assign their array to the grades property
        Grades.setGrades(userArray);


        
        //// possible way of running the methods in a more user-friendly manner
        // boolean runTime = true;
        // while (runtime) {
        //     System.out.println("What would you like to do?");

        // }

    }   

}