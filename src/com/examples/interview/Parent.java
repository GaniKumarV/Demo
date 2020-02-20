package com.examples.interview;

public class Parent {

	public void m1() {

		System.out.println("Parent method called:::::");
	}

}

class Child extends Parent {

	public void m1() {

		System.out.println("child method:::::");
	}
}

class Demo {

	public static void main(String[] args) {

		Parent p = new Parent();
		Child c = new Child();
		p.m1();
		c.m1();
	}
}
