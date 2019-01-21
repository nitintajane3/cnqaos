package com.cnqaos.collection2;

import javax.xml.bind.helpers.AbstractUnmarshallerImpl;

import org.testng.annotations.Test;

public class testtwo  
{
	
@Test()
public void teonemain() 
{
	String sameple = "abcdefghijklmp";
	
	StringBuilder builder =new StringBuilder();
	builder = builder.append(sameple);
	 //System.out.println(builder.reverse() + " using builder");
	
	 String namee =  new StringBuffer(sameple).reverse().toString();
	 //System.out.println(namee + " using buffer");
	 
	 
	 char[] ame = sameple.toCharArray();
	 //System.out.println(sameple.length() + "actual length");
	 //System.out.println(ame.length  + "expected length");
	 int lee = ame.length-1;
	 for(int i=lee;i>1;i--)
	 {
		 //System.out.print(ame[i]);
	 }
	 
	 
	

	 int n = 10, t1 = 0, t2 = 1;
     System.out.print("First " + n + " terms: ");

     for (int i = 1; i <= n; ++i)
     {
    	System.out.print(t1 + " ");

         int sum = t1 + t2;
         t1 = t2;
         t2 = sum;
    
    }
    
     
    }
	 
	 
}
	

	

	

