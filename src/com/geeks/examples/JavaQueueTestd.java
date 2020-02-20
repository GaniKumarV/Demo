package com.geeks.examples;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Spliterator;

public class JavaQueueTestd {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);

		System.out.println(queue);

		int removeItem = queue.remove();

		System.out.println(removeItem);

		System.out.println(queue);

		int topItem = queue.element();

		System.out.println(topItem);

		System.out.println(queue);
		
		
		//split iterator example java8 below
		
		List<Integer> list =Arrays.asList(1,2,3,4,5,5);
		
		Spliterator<Integer> spliterator =list.spliterator();
	}

}
