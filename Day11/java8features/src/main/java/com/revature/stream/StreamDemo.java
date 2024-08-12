package com.revature.stream;

import java.util.*;

public class StreamDemo {
	public static void main(String[] args) {
		
		List<String> names=new ArrayList();
		names.add("Vilas");
		names.add("Vijay");
		names.add("Vibhore");
		names.add("Rahul");
		names.add("Arjun");
		
		
		  for(String name:names) System.out.println(name);
		 
		System.out.println("***************************************************");
		
		names.stream().forEach(name->System.out.println(name));
		
		
		
	}
}
