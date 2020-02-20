package com.examples.interview;

public class MyThread  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<100;i++) {
			
			System.out.println("Lazy Thread::::::");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
				System.out.println("Thread got innterrrupted::::");
			}
		}
		
	}
}
class ThreadDemo{
	
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		
		Thread t = new Thread(myThread);
		
		t.start();
		
		t.interrupt();
		System.out.println("end of main:::::");
		
	}
}
