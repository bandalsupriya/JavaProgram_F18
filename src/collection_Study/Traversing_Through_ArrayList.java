package collection_Study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traversing_Through_ArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Integer>al= new ArrayList<>();
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add(17);
		System.out.println(al);
		System.out.println(al.size());
		//System.out.println(al.get(3));
		
		// static for loop-->
		System.out.println("=====static for loop=====");
		
		for(int i=0;i<=5;i++)         //0,1,2,3,4,5
		{
		System.out.println(al.get(i));
		}
		
		// dynamic for loop-->
		System.out.println("=====dynamic for loop=====");
		
		for(int i=0;i<=al.size()-1;i++)
		{
		System.out.println(al.get(i));
		}
		
		// for each loop/enhanced loop
		System.out.println("=====for each loop=====");
	
		for(Integer a:al)
		{
		System.out.println(a);
		}
        
	// Cursor
		System.out.println("===== Cursor =====");
		System.out.println("===== 1) Iterator =====");
		// 1) Iterator
		Iterator<Integer> it = al.iterator();
		
		   // use  while loop--> execute the loop/statement if condition is true
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("===== 2)ListIterator =====");
		// 2)ListIterator
		
		ListIterator<Integer> li = al.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
				
		
		
	}

}
