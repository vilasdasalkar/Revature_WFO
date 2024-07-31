import java.util.*;
public class IfElse {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");


        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }
}
