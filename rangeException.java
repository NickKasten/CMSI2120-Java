public class rangeException extends Exception{
    // declare
    private String msg;
    // instantiate
    rangeException() {
    }
    // construct
    rangeException(String limit) {
        msg = "Your value is above the limit: " + limit;
    }
    public void setMessage(String limit) {
        msg = "Your value is above the limit: " + limit;
    }
    public String getMessage() {
        return msg;
    }
}

        // // Instantiating an array that is the size of the number of grades we have given it
        // grades = new int[numberOfGrades];

        // // for each grade, ask then put that input into the array
        // for (int i = 0; i < numberOfGrades; i++) {
        //     System.out.printf("Enter grade %d:", (i+1));

        //     // have the scanner's input get assigned to the userInputGrade variable
        //     String userInputGrade = myScanner.nextLine();
        //     // now lets TRY to just grab their stuff
        //     try{
        //         int userGrade = Integer.parseInt(userInputGrade);
        //         grades[i] = userGrade;
        //     } catch (NumberFormatException nfe) {
        //         nfe.printStackTrace();
        //     }
        // }
