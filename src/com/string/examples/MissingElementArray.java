package com.string.examples;

public class MissingElementArray {
	
	public static void main(String[] args) {
		
		
	
				
			 int[] arry ={1, 2, 3, 4, 6, 7, 9, 8, 10};
			 
			 int totalCount=10;
			 int actualSume=0;
			 
			 int expectedSume=totalCount*(totalCount+1)/2;
			 
			 for (int i : arry) {
				 actualSume=actualSume+i;
				 
				
			}
			 
			 int missingElement=expectedSume-actualSume;
			 System.out.println(missingElement);

	
		
		
	}

}
