package com.revature.runnable;

public class RunnableDemo implements Runnable {
	 private Thread t;
	   private String threadName;
	   
	public RunnableDemo(String name) {
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
