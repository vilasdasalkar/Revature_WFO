/*

 Write a program to reverse a 3-digit number. 
E.g.-Number : 132        Output : 231
Input the number using scanner.
*/

import java.util.*;

public class Rev_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digit number = ");
      int n=sc.nextInt();
        System.out.print("reverse of digit is = ");
        while(n>0){
        int rem=n%10;
        System.out.print(rem);
        n=n/10;}
    


}
}