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

