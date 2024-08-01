import java.util.*;

public class ArrayPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer: ");
            num[i] = sc.nextInt();
        }

        System.out.println("The entered integers are:");
        for (int i=0;i<10;i++) {
            System.out.println(num[i]);
        }

       
    }
}
