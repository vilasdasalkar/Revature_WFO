//Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.

import java.util.*;
public class Prob3 {

    public static void main(String[] args) {

                       double result1=(2345+8)/3;
                       double res2=result1%5;
                       double res3=res2*5;

         System.out.println("The final result is : "+res3);
  
       
           }
}
