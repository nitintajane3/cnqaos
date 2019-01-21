package com.cnqaos.collection2;

import org.testng.annotations.Test;

public class reversestring {
	
	@Test
	public void reve()
	{
		String sameple = "12345566789";
		 char[] ame = sameple.toCharArray();
		 //System.out.println(sameple.length() + "actual length");
		 //System.out.println(ame.length  + "expected length");
		 int lee = ame.length-1;
		 for(int i=lee;i>=0;i--)
		 {
			 System.out.print(ame[i]);
		 }
		 
		 int x = 50;
	        int y = 30;
	        System.out.println("Before swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	        x = x+y; 
	        y=x-y; 
	        x=x-y;
	        System.out.println("After swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	
	
	
	        int a[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };

			int min = a[0]; //  assume first elements as smallest number
			int max = a[0]; //  assume first elements as largest number

			for (int i = 1; i < a.length; i++)  // iterate for loop from arrays 1st index (second element)
			{
				if (a[i] > max) 
				{
					max = a[i];
				}
				if (a[i] < min) 
				{
					min = a[i];
				}
			}

			System.out.println("Largest Number in a given array is : " + max);
			System.out.println("Smallest Number in a given array is : " + min);
	
	}

}
