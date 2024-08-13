package com.revature.string;
import java.util.Scanner;
public class Problem2 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        String fullName = sc.nextLine();
	        
	        String[] nameParts = fullName.split(" ");
	        
	        int l=nameParts.length;

	        for (int i = 0; i < l - 1; i++) {
	            System.out.print(nameParts[i].charAt(0) + ".");
	        }
	        System.out.println(nameParts[l - 1]);
	    }
}
