package com.string.examples;

public class ReverseString {

	public static void main(String[] args) {

		char[] charss = reverseString("gani");

		System.out.println(charss);

	}

	public static char[] reverseString(String str) {

		char[] chars = str.toCharArray();

		int i = 0;
		int j = chars.length - 1;
		while (i < j) {

			swapCharacter(chars, i, j);

			i++;
			j--;
		}

		return chars;
	}

	private static void swapCharacter(char[] chars, int i, int j) {
		// TODO Auto-generated method stub

		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;

	}

}
