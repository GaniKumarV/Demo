package com.thread.examples;

public class SynchDemo {
	
	public static void main(String[] args) {
		
		
		Dispaly d1 = new Dispaly();
		Dispaly d2 = new Dispaly();
		
		MyThreadSynch myThreadSynch = new MyThreadSynch(d1, "Revanash");
		MyThreadSynch myThreadSynch1 = new MyThreadSynch(d2, "Tej");
		
		myThreadSynch.start();
		myThreadSynch1.start();
	}

}
