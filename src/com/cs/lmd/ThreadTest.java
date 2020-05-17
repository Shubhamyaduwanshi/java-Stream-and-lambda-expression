package com.cs.lmd;

public class ThreadTest {
 
	Runnable run=()->System.out.println("Thread running");
	
	public static void main(String[] args) {
		ThreadTest threadTest=new ThreadTest();
		Thread t=new Thread(threadTest.run);
		t.start();
	}
}
