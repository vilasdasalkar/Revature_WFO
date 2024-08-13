package com.revature.string;

public class Problem6 {
	
	    public static void main(String[] args) {
	        String[] names = {"Vilas", "Rahul", "Abhijeet", "Viju", "Shrey", "Pooja", "Aksh", "Arjun", "Neha", "Sonu"};
             int l=names.length;
	        for (int i = 0; i < l - 1; i++) {
	            for (int j = i + 1; j <l; j++) {
	                if (names[i].compareTo(names[j]) > 0) {
	                    String temp = names[i];
	                    names[i] = names[j];
	                    names[j] = temp;
	                }
	            }
	        }

	        for (String s : names) {
	            System.out.println(s);
	        }
	    }
	}


