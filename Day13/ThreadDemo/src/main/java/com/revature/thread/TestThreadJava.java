package com.revature.thread;

public class TestThreadJava {
	public static void main(String arge[]) {
		ThreadDemo1 T1=new ThreadDemo1("Thread-1");
		T1.start();
		
		ThreadDemo1 T2=new ThreadDemo1("Thread-2");
		T2.start();
	}

}
