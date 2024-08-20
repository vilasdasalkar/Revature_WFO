package com.revature.thread;

public class ThreadDemo1 extends Thread {
   private Thread t;
   private String threadName;
public ThreadDemo1(String name) {
	threadName=name;
	System.out.println("creating "+ threadName);
}
public void run() {
	System.out.println("Running "+ threadName);
	
	try {
		for(int i=4;i>0;i--) {
			System.out.println("Thread "+ threadName+","+i);
			Thread.sleep(1000);
		}
	}catch(InterruptedException e){
		System.out.println("Thread "+ threadName+" Interrupted");
	}
	System.out.println("Thread "+ threadName+" exiting");
}
   
   
}
