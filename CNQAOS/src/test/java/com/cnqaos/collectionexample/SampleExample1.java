package com.cnqaos.collectionexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class SampleExample1 
{

	 public static int z;
	 
	public final void test()
	{
		
	}	
	
	public void test(int a)
	{
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedList<Object[]> ll = new LinkedList<Object[]>();
		
		
		
		ArrayList<Object> arrayobject = new ArrayList<Object>();
		arrayobject.add("nitin");
		arrayobject.add(1992);
		arrayobject.add("ashwini");
		arrayobject.add(1993);
		arrayobject.add("laxman");
		Object[]  objects = new Object[3];
		objects[0] = 1;
		objects[1] = 2;
		objects[2] = 3;
		
		int[] test = new int[2];
		Iterator<Object> iter = arrayobject.iterator();
		
		
		
        System.out.println("Initial size of LinkedList: "+ll.size());

       
        // add elements to the linked list
        ll.add(objects);
        
        for(int i=0; i <= objects.length;i++ )
        {
        	
        }
        /*ll.add("54546");
        ll.add("PHP");
        ll.add("DBMS");
        ll.add("CSS");
        ll.addLast("JavaScript");
        ll.addFirst("HTML");*/
        
        //String al1 = (String)(ll.get(2));
      
       
        System.out.println("Element of LinkedList: " );
        System.out.println("Size of LinkedList after addition: "+ll.size());

        
        // remove elements from the linked list
        
        
       
      

        //Retriving First and Last element
       

        Iterator<Object[]> iterntr = ll.iterator();
       while (iterntr.hasNext()) 
       {
		System.out.println(" ll iterator " + iterntr.next()+"/n,  ");
		
	   }
        
        
        Iterator<Object> itr = arrayobject.iterator();
        while(itr.hasNext())
        {
              System.out.print(" arrayobject iterator " + itr.next()+", ");
        }
        
        

	}

}
