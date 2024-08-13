package com.revature.string;

public class Problem4 {
		public static void main(String[] args) {
	        String s = "nitin";
	       
	        String s2="";
	        
	        int l = s.length();
	        
	        for(int i=l-1;i>=0;i--){
	            s2=s2+s.charAt(i);
	        }
	        
	        if(s.equals(s2)){
	            System.out.print("given string is palindrome");
	        }else{
	            System.out.print("given string is not palindrome");
	        }
	}}

