



public class Demo2 {

    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();
        
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));
    }
}
