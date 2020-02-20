package com.thread.examples;

public class MyThreadSynch extends Thread {

	Dispaly d;
	String name;

	public MyThreadSynch(Dispaly d, String name) {
		super();
		this.d = d;
		this.name = name;
	}

	public void run() {

		d.wish(name);
	}

}
