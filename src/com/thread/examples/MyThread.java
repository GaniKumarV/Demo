package com.thread.examples;

public class MyThread extends Thread {
	
	
	public void run() {
		
		for(int i=0;i<=10;i++) {
			
			Thread.yield();
			
			System.out.println("run method ::::"+i);
		}
	}

}
