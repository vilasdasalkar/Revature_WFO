package com.revature.livelock;

public class Criminal {
	  private boolean hostageReleased = false;

	  public synchronized void releaseHostage(Police police) {
	    while (!police.isRandomSent()) {
	      System.out.println("Criminal: waiting for police to give ransom.");

	      try {
	        Thread.sleep(1000);
	      } catch (InterruptedException ex) {
	        ex.printStackTrace();
	      }
	    }

	    System.out.println("Criminal: Releasing Hostage");
	    this.hostageReleased = true;
	  }

	  public boolean isHostageReleased() {
	    return this.hostageReleased;
	  }
	}