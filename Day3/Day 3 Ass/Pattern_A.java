/*
5. 
Print the following patterns using loop :
a.
*
**
***
****

*/

import java.util.*;


public class Pattern_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n " );
        int n=sc.nextInt();
       
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++){
             System.out.print("*");
                
            }
            System.out.println();
        }
        

       
    }
}
