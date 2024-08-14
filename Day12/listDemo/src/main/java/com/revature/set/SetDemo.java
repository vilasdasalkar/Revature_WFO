package com.revature.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String args []) {
	Set<String> map = new HashSet<>();
	//Set<String> map = new LinkedHashSet<>();
	//Set<String> map = new TreeSet<>();
	
  	  
  	  map.add("Abhijeet");
		  map.add("Vilaas");
		map.add("Pratik");
		map.add("Raj");
		map.add("Jeet");
		
		for(String name:map) {
			System.out.println(name);
		}
    }
}
