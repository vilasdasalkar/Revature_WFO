public class CustomException extends Exception {
    private String message;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "CustomException: " + message;
    }
}
public class Main {
    public static void main(String[] args) {
        try {
                        throw new CustomException("This is a manually thrown custom exception.");
        } catch (CustomException e) {
            
            System.out.println(e.getMessage());
        }
    }
}
