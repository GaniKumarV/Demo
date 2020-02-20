package com.examples.interview;

public class Test {

	int i;

	static {

		System.out.println("static block:::::");
	}
	{
		System.out.println("instance block:::::");
	}

	public Test(int i) {
		super();
		this.i = i;
	}

	public static void main(String[] args) {

		Test t = new Test(10);

		Test t1 = new Test(20);
		
		
	}

	/*
	 * @Override public int m1() { // TODO Auto-generated method stub return 0; }
	 */

}
