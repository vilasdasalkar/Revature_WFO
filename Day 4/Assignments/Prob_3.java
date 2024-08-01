import java.util.Scanner;
/*Take 10 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.*/

public class Prob_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] numbers = new int[10];
        int positiveCount = 0, negativeCount = 0, oddCount = 0, evenCount = 0, zeroCount = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer: ");
            numbers[i] = sc.nextInt();
        }

        for (int number : numbers) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of 0s: " + zeroCount);

       
    }
}
