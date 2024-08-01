import java.util.Scanner;

public class Sumprod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int sum = 0;
        int product = 1;

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }

        for (int number : num) {
            sum += number;
            product *= number;
        }

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);

       
    }
}
