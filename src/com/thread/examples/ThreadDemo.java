package com.thread.examples;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		
		MyThread myThread = new MyThread();
		
		myThread.start();
		
		//myThread.start();
		
		
		
		//here is main thread will start :::::
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("Mian Thread::::::"+i);
		}
		
		
		/*
		 * System.out.println("get state::::"+myThread.getStackTrace());
		 * System.out.println("get state::::"+myThread.getId());
		 * System.out.println("get state::::"+myThread.getName());
		 * System.out.println("get state::::"+myThread.getPriority());
		 * System.out.println("get state::::"+myThread.getc);
		 */
		
	}

}
