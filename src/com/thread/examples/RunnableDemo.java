package com.thread.examples;

public class RunnableDemo {

	public static void main(String[] args) {
		
		
		MyRunnable myRunnable = new MyRunnable();
		
		Thread thread = new Thread(myRunnable);
		
		thread.start();
		
		for(int i=0;i<10;i++) {
			
			System.out.println("main method :::::::"+i);
		}
		
		
		
		Thread.currentThread().setName("Revansh Thread:::::::");
		
		System.out.println(thread.getName());
		
	}
}
