package com.revature.mocks;

import java.util.Arrays;
import java.util.List;

public class PersonRepository {
    public List<String> findAll(){
    	System.out.println("Person repository findAll()");
    	return Arrays.asList("vilas","jasdhir","alex","sonu");
    	
    }
}
