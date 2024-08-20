package com.revature.synchronization;

public class MainDemo {
	
      //without Syncronization  
	
	public void updateValueFiveTimesByAddingOne() throws InterruptedException {
	    System.out.println("Print statement before addingOne loop");

	    // iterate 5 times, update value by 1 every time
	    for (int i = 1; i <= 5; i++) {
	      System.out.println(++value);
	      Thread.sleep(500);
	    }

	    System.out.println("Print statement after addingOne loop");
	}

	public void updateValueFiveTimesByAddingTwo() throws InterruptedException {

	    System.out.println("Print statement before addingTwo loop");

	    // iterate 5 times, update value by 2 every time
	    for (int i = 1; i <= 5; i++) {
	      value += 2;
	      System.out.println(value);
	      Thread.sleep(500);
	    }

	    System.out.println("Print statement after addingTwo loop");
	}
	    int value = 0;

	    public static void main(String[] args) {
	        // create object to work with
	        MainDemo myObj = new MainDemo();

	        // create threads
	        Thread thread1 = new Thread(() -> {
	            try {
	                myObj.updateValueFiveTimesByAddingOne();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        Thread thread2 = new Thread(() -> {
	            try {
	                myObj.updateValueFiveTimesByAddingTwo();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        // start threads
	        thread1.start();
	        thread2.start();
	    }
	
}
