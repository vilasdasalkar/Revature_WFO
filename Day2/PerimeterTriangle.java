//Write a program to calculate the perimeter of a triangle. Input the sides of triangle using command Line arguments.

import java.util.*;
public class PerimeterTriangle {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the side 1:");
        float a=sc.nextFloat();
        System.out.println("Enter the side 2:");
        float b=sc.nextFloat();
        System.out.println("Enter the side 3:");
        float c=sc.nextFloat();

        float Perimeter=a+b+c;
        
         System.out.println("Perimeter of triangle is : " +Perimeter);
         

        

       



           }
}
