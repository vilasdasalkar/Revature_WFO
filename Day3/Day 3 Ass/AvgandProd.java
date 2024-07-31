import java.util.*;

public class AvgandProd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int product = 1;
        int count = 0;

        while (true) {
            System.out.print("Enter an integer (press 'q' to quit): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            int number = Integer.parseInt(input);
            sum += number;
            product *= number;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
            System.out.println("Product: " + product);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}
