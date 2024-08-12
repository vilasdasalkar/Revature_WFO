package com.revature.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo1 {
public static void main(String[] args) {
		
		List<String> names=new ArrayList();
		names.add("Vilas");
		names.add("Vijay");
		names.add("Vibhore");
		names.add("Rahul");
		names.add("Arjun");
		
		
		names.stream().filter((n->n.startsWith("V"))).forEach(n->System.out.println(n));
		
System.out.println("***************************************************");
		
		names.stream().filter((n->n.startsWith("R"))).forEach(System.out::println);
		
System.out.println("***************************************************");
		
		names.stream().map(n->n.toUpperCase()).forEach(System.out::println);
		
		
	}
}
