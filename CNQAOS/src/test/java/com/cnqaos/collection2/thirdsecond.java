package com.cnqaos.collection2;

import org.testng.annotations.Test;

public class thirdsecond 
{
	@Test
	public void yellow()
	{
		
	      int w[] = {10, 20, 25, 63, 96, 57};
	     int temp ;
	     int size = w.length;
	      
	      for(int i=0;i< size;i++)
	      {
	    	 for(int j=i+1;j< size;j++)
	    	 {
	    		 if(w[i] > w[j] )
	    		 {
	    			temp = w[i];
	    			w[i] = w[j];
	    			w[j] = temp;
	    		 }
	    	 }
	      }
	      System.out.println(w[size-3]);
	     
}
}
