package com.revature.livelock;

public class Main {
	  static final Police police = new Police();
	  static final Criminal criminal = new Criminal();

	  private static Thread t1;
	  private static Thread t2;

	  // Notice that this code will never stop...
	  public static void main(String[] args) throws Exception {
	    t1 = new Thread(() -> {
	      t1.setName("Thread 1");
	      police.giveRansom(criminal);
	    });
	    t1.start();

	    t2 = new Thread(() -> {
	      t2.setName("Thread 2");
	      criminal.releaseHostage(police);
	    });
	    t2.start();

	    // debugging: print state and name of threads over time
	    for (int i = 0; i <= 10; i++) {
	      System.out.print("-----------------\n" +
	          "Name: " + t1.getName() + "\n" +
	          "State: " + t1.getState() + "\n" +
	          "-----------------\n");

	      System.out.print("-----------------\n" +
	          "Name: " + t2.getName() + "\n" +
	          "State: " + t2.getState() + "\n" +
	          "-----------------\n");
	      Thread.sleep(1000);
	    }
	  }
	}

