package pkg07_Exception;

class CustomException extends Exception {
    public CustomException(String yourMessage) {
        super(yourMessage);
    }
}

public class C05_UserDefinedException {

    public static void main(String[] args) {
        try {
            throw new CustomException("Custom message");
        } catch(CustomException exp) {
            System.out.println(exp);
        }
    }
}
