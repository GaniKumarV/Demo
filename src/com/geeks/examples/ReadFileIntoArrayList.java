package com.geeks.examples;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ReadFileIntoArrayList {

	public static void main(String[] args) {

		String fileName = "C:\\WorkPOC\\test.txt";

		fileStreamUsingBufferedReader(fileName);

	}

	public static void fileStreamUsingBufferedReader(String fileName) {

	
		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lines.forEach(System.out::println);

		System.out.println(lines.size());

		Set<String> uniqueWords = new HashSet<String>(lines);
		for (String word : uniqueWords) {
			System.out.println(word + ": " + Collections.frequency(lines, word));
		}

		// use contains() to check if the element
		// 2 exits or not
		List<String> pinklist = new ArrayList();
		List<String> redlist = new ArrayList();
		List<String> greenlist = new ArrayList();
		List<String> yellowlist = new ArrayList();
		List<String> bluelist = new ArrayList();

		boolean ans = lines.contains("yellow");

		for (String yellow : lines) {

			if (yellow.equalsIgnoreCase("yellow")) {
				yellowlist.add(yellow);

			}

		}
		System.out.println("yellow list size"+yellowlist.size());
		System.out.println("yellow balls drop into bucket");
		yellowlist.forEach(System.out::println);

	}

}
