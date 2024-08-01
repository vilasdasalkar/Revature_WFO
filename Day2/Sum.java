import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 5 digit number= ");
        int num = sc.nextInt();

        int Digit1 = num / 10000;

        int secondLastDigit = (num / 10) % 10;

        int sum = Digit1 + secondLastDigit;

        System.out.println("Sum of first and second last digit is  " + sum);

       
    }
}
