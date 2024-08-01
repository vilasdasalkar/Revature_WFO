
public class CustomException extends Exception {
    private String message;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "CustomException: " + message;
    }

    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom message.");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
