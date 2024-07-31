//4) Input the marks of Robert in three subjects using Scanner (each out of 100 ), write a program to calculate his total marks and percentage marks.

import java.util.*;
public class totlMarks {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the sub 1:");
        float a=sc.nextFloat();
        System.out.println("Enter the sub 2:");
        float b=sc.nextFloat();
        System.out.println("Enter the sub 3:");
        float c=sc.nextFloat();

        float ttl=a+b+c;
        float per= (ttl/3);   
          System.out.println("total marks : " +ttl);
  
         System.out.println("Percentage is : " +per);
         

        

       



           }
}
