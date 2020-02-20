package com.examples.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");

		// al.removeIf(str -> str.contains("Ajay")); // Here, we are using Lambda
		// expression

		ArrayList<String> al1 = removeObjectList(al, "Ravi");

		System.out.println(al1);

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(10, "gani");
		hm.put(10, "gani");
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(10);
		
		System.out.println(hs);

		System.out.println(hm);

	}

	public static ArrayList<String> removeObjectList(ArrayList<String> list, String str) {

		list.removeIf(st -> st.contains(str));

		return list;

	}

}
