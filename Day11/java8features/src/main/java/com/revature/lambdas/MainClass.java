package com.revature.lambdas;

public class MainClass {
   public static void main(String [] args) {
	  // SayName name=new SayName();
	  // name.sayHello();
	   
	   Say say=()->{return "Hello Lambdas";};
	   System.out.println(say.sayHello());
   }
   
}
