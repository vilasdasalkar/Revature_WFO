package com.revature.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String [] args) {
		List<String> myList=new ArrayList();
		
		myList.add("Abhijeet");
		myList.add("Vilaas");
		myList.add("Pratik");
		myList.add("Raj");
		myList.add("Jeet");
		
		for(String name:myList) {
			System.out.println(name);
		}
		
		System.out.println("*********************************************");
		
		Iterator myItr=myList.iterator();
		while(myItr.hasNext()) {
			System.out.println(myItr.next());
		}
		System.out.println("*********************************************");
		
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
		
		
	}

}
