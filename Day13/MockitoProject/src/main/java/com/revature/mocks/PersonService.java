package com.revature.mocks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonService {
     private PersonRepository repository;
     
     public PersonService() {
	 this.repository=new PersonRepository();
	 }
	 public List<String> sort(){
	    	System.out.println("Person service sort()");
	    	List<String> users=this.repository.findAll();
	    	Collections.sort(users);
	    	return users;
     }
     
}
