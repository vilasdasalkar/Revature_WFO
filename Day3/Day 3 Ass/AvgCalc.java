import java.util.*;

// Take 10 integers from keyboard using loop and print their average value on the screen.

public class AvgCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer " + i  + "= ");
            int number = sc.nextInt();
            sum += number;
        }

        double avg = sum / 10.0;
        System.out.println("Average value of all 10 intergers is = " + avg);
    }
}
