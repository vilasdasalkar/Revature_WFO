//Write a program to calculate the area and perimeter of the rectangle. Input Length and breadth using command line arguments.

import java.util.*;
public class AreaRectangle {

    public static void main(String[] args) {

       Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length:");
       int h=sc.nextInt();
       System.out.println("Enter the breadth:");
       int b=sc.nextInt();

       float area=b*h;
       float perimeter=2*(b+h);
         
         System.out.println("Area of rectangle is: "+area);
          System.out.println("perimeter of reactangle is:"+perimeter);




           }
}
