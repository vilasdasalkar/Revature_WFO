package com.revature.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LList {
	public static void main(String [] args) {
		List<String> ll=new ArrayList();
	ll.add("A");
	ll.add("B");
	ll.add("C");
	ll.add("D");
	ll.add("E");
	
	System.out.println(ll);
	
	ll.remove("B");
	System.out.println(ll);
	
	ll.removeFirst();
	System.out.println(ll);
	
	ll.add("B");
	System.out.println(ll);
	
	ll.set(1, "A");
	System.out.println(ll);
	
	ll.set(0, "Z");
	System.out.println(ll);
	
	Iterator lll=ll.iterator();
	while(lll.hasNext()) {
		System.out.println(lll.next());
	}
	

}
}
