package com.examples.interview;

import java.util.TreeMap;

public class TreeMapDemo {
	
	
	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
		
		tm.put(null, "gani");
		tm.put(101, "sumi");
		
		tm.forEach((k,v)->System.out.println(k+" :::"+v));
	}

}
