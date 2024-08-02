
import java.util.*;

public class MinMaxArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("At least two elements are required.");
            return;
        }
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        int maxDifference = array[n - 1] - array[0];

        int minDifference = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int difference = array[i] - array[i - 1];
            if (difference < minDifference) {
                minDifference = difference;
            }
        }

        System.out.println("Maximum Difference: " + maxDifference);
        System.out.println("Minimum Difference: " + minDifference);

        
    }
}