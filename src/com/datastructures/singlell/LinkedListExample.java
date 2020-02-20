package com.datastructures.singlell;

public class LinkedListExample {

	Node head;

	public void display() {

		Node n = head;

		while (n != null) {

			System.out.print(n.data);

			n = n.next;
		}
	}

	public static void main(String[] args) {

		LinkedListExample list = new LinkedListExample();

		list.head = new Node(100);
		Node second = new Node(200);
		Node third = new Node(300);

		list.head.next = second;
		second.next = third;

		list.display();

	}

}
