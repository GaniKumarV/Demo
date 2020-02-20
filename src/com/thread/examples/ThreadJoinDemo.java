package com.thread.examples;

public class ThreadJoinDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThreadJoin  myThreadJoin = new MyThreadJoin();
		
		
		myThreadJoin.start();
		
		//k,iiiiiiiiiiiiiiiiiiiiiiiiiiiiiii myThreadJoin.join();
		myThreadJoin.interrupt();
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("Rama Thread::::::");
		}
		
	}

}
