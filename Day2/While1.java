import java.util.*;
public class While1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");

        int i =sc.nextInt();
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
