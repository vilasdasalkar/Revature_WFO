package calculator.sum;

public class AllOperation {

	    public static void main(String[] args) {
	        MathOperations mathOperations = new MathOperations();
	        
	        double num1 = 10;
	        double num2 = 5;

	        System.out.println("Addition: " + mathOperations.add(num1, num2));
	        System.out.println("Subtraction: " + mathOperations.subtract(num1, num2));
	        System.out.println("Multiplication: " + mathOperations.multiply(num1, num2));
	        
	        try {
	            System.out.println("Division: " + mathOperations.divide(num1, num2));
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}



