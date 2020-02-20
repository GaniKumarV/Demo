package come.datastructures.circularll.examples;

public class CircularLL {

	Node head = null;
	Node tail = null;

	public void add(int data) {

		Node newNode = new Node(data);
		// if checks

		if (head == null) {

			head = newNode;
			tail = newNode;

			newNode.next = head;
		}

		else {

			tail.next = newNode;

			tail = newNode;

			tail.next = head;
		}
	}

}
