package com.thread.examples;

public class Dispaly {
	
	public synchronized void wish(String name) {
		
		for(int i=0;i<=10;i++) {
			
			System.out.print("Good Morning :::::");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}

}
