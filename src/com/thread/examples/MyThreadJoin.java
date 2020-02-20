package com.thread.examples;

public class MyThreadJoin extends Thread {

	public void run() {

		for (int i = 0; i <= 100; i++) {

			System.out.println("sita thread:::::::");

			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();

				System.out.println("I got inttreupted::::::::");
			}

		}

	}

}
