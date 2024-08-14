package com.revature.map;

import java.util.HashMap;
import java.util.Set;

public class MapDemo {
   public static void main(String args []) {
	   HashMap<String,Double> bal=new HashMap<String,Double>();
	   bal.put("vilas",1009.87);
	   bal.put("abhi",2009.87);
	   bal.put("rahul",4009.87);
	   bal.put("viju",5409.87);
	   bal.put("rohit",8709.87);
	   bal.put("vilas",2345.876);
	   
	   System.out.println(bal.get("vilas"));
	   
	   Set<String> keys=bal.keySet();
	   
	   for(String key:keys) {
		   System.out.println(key+":"+bal.get(key));
	   }
	   
   }
}
