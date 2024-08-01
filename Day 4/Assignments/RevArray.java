import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] rev = new int[10];

        for (int i = 0; i <10; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i <10; i++) {
            rev[i] = num[9 - i];
        }

        for (int number : rev) {
            System.out.print(number + " ");
        }

    
    }
}
