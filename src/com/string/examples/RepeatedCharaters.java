package com.string.examples;

import java.util.HashMap;

public class RepeatedCharaters {

	public static void main(String[] args) {
		
		
		repeatedDuplicateCount("ganiganir");
		

	}

	public static void repeatedDuplicateCount(String word) {

		char[] characters = word.toCharArray();

		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char ch : characters) {

			if (charMap.containsKey(ch)) {

				charMap.put(ch, charMap.get(ch) + 1);
				
			} else {

				charMap.put(ch, 1);


			}

		}
		
		charMap.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v+":"+k+k));
	}

}
