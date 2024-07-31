import java.util.*;

public class ExamAllow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the ttl number of classes  ");
        int ttlclass = sc.nextInt();

        System.out.print("classes attended by student ");
        int Attend = sc.nextInt();

       int per = ( ttlclass / Attend) * 100;
        System.out.println("Percentage of attendance " + per + "%");

        if (per < 75) {
            System.out.print("student have a medical cause? ");
            char medical_issue = sc.next().charAt(0);

            if (medical_issue == 'Y' || medical_issue== 'y') {
                System.out.println("You are allowed to sit in the exam.");
            } else {
                System.out.println("You are not allowed to sit in the exam.");
            }
        } else {
            System.out.println("You are allowed to sit in the exam.");
        }
    }
}
