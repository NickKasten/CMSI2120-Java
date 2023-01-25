import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
// self-made exception
//import java.rangeException;

public class Grades {
    
    private int[] grades;
    //private int highest;
    //private int lowest;
    //private int numberOfGrades;

    // use the constructor to make their values?
    Grades() {};

    Grades(int[] myArray) {
        this.grades = myArray;
        //highest = grades[(grades.length-1)];
        //lowest = grades[0];
    }


    public void setValues(int[] myArray) {
        this.grades = myArray;
    }
    
    public int[] getValues() {
        return this.grades;
    }

    public int highest() {
        // manual sorting:
        /*  int storeVar = 0;
            for (int num = 0; num < this.grades.length; num++) {
                if (this.grades[num] > storeVar) {
                    int storeVar = this.grades[num];
                }
            }
            return storeVar;
         * 
         */
        Arrays.sort(this.grades);
        return this.grades[(this.grades.length-1)];
    }

    public int lowest() {
        Arrays.sort(grades);
        return grades[0];
    }

    public int numOfGrades() {
        return grades.length;
    }
    
    public double average() {
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

    public int numOfFailingGrades(int gradeValue) {
        int counter = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < gradeValue) {
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
        
        
        int[] gradesArray = new int[]{
            a,
            b,
            c,
            d,
            f
        };


        String[] phrases = new String[]{
            "90 - 100 | ",
            "80 - 89  | ",
            "70 - 79  | ",
            "60 - 69  | ",
            "< 60     | "
        };

        HashMap<String, Integer> histGrades = new HashMap<String, Integer>();
        for (int i = 0; i < 5; i++) {
            histGrades.put(phrases[4-i], gradesArray[4-i]);
            System.out.println(phrases[4-i]);
        }

        // for each string statement

        // why is the the set of keys messed up???
        //System.out.println(histGrades.keySet());

        for (String text : histGrades.keySet()) {
            System.out.printf("%s", text);
            for (int x = 1; x <= histGrades.get(text); x++) {
                System.out.print("*");
            }
            System.out.println("");
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
            int inputNumOfGrades = Integer.parseInt(userInputGradesNum);
            
            // Instantiating an array that is the size of the number of grades we have given it
            int[] userArray = new int[inputNumOfGrades];

            rangeException re = new rangeException();
            // for each grade, ask then put that input into the array
            for (int i = 0; i < inputNumOfGrades; i++) {
                System.out.printf("Enter grade %d:", (i+1));
        
                // have the scanner's input get assigned to the userInputGrade variable
                String userInputGrade = myScanner.nextLine();

                int userGrade = Integer.parseInt(userInputGrade);
                if (userGrade > 100) {
                    throw re;
                }
                userArray[i] = userGrade;

                //debug   System.out.println(Arrays.toString(userArray));
            }

        // call the setter to assign their array to the grades property
        Grades theirGrades = new Grades(userArray);
        System.out.println(theirGrades.average());
        theirGrades.histogram();
        
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            return;
        } catch (rangeException exc) {
            System.out.println(exc.getMessage());
            return;
        }
        



        
        //// possible way of running the methods in a more user-friendly manner
        // boolean runTime = true;
        // while (runtime) {
        //     System.out.println("What would you like to do?");

        // }

    }   

}