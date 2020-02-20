package com.geeks.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SearchTask implements Callable<Integer> {
	
	 private int localCounter = 0;
     private int start; // start index of search
     private int end;
     private List<String> words;
     private String token;

     public SearchTask(int start, int end, List<String> words, String token) {
         this.start = start;
         this.end = end;
         this.words = words;
         this.token = token;
     }

     public Integer call() {
         for(int i = start; i < end; i++) {
              if(words.get(i).equals(token)) localCounter++;
         }
         return localCounter;
     }        
}
class Test{
	
	public static void main(String[] args) {
		
		
		/*
		 * 
		 * 
		 * // create tasks List<Callable> tasks = new ArrayList<Callable>();
		 * tasks.add(new SearchTask(0, 10000, words, "John")); tasks.add(new
		 * SearchTask(10000, 20000, words, "John")); tasks.add(new SearchTask(20000,
		 * 30000, words, "John"));
		 * 
		 * // create thread pool and start tasks ExecutorService exec =
		 * Executors.newFixedThreadPool(3); List<Future> results =
		 * exec.invokeAll(tasks);
		 * 
		 * // wait for tasks to finish and collect results int counter = 0; for(Future
		 * f: results) { counter += f.get(); }
		 */}
}

