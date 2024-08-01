/*

 Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6
Input the number using scanner.
*/

import java.util.*;

public class Sum3digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digit number = ");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
        int rem=n%10;
        sum=sum+rem;
        n=n/10;}
    System.out.print("Sum of digit is = "+sum);


}
}