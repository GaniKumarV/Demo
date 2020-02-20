package com.sort.algortihms.examples;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		
		
		 int  arr[]={100,20,15,30,5,75,40};
		 
		int [] bb = bubbleSort(arr);
		
		for (int i : bb) {
			
			System.out.print(" "+i);
			
		}
		 
	}

	private static int [] bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length-1-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		return arr;
		
	}

}
