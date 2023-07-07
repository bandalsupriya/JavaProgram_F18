package collection_Study;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Use {

	public static void main(String[] args)
	{
		// create an object of Vector to access there methods
		
		Vector<Object> v=new Vector<>();
		v.add("Rupesh");
		v.add("Rupesh");
		v.add(10);
		v.add(true);
		v.add(null);
		v.add(null);
		v.add(12.12f);
		v.add('R');
		v.add(1, "Never");
		
		System.out.println(v);
		
		// 1) Capacity-->default capacity of vector is 10/ if all occupy then its resize double
		System.out.println(v.capacity());   //default capacity of vector is 10
		
		// 2) size--> returns no. of elements present at actual in the list  
		System.out.println(v.size());
		
		v.add("Raigad");
		v.add(100);
		System.out.println(v.capacity());  // if all occupy then its resize double--20- capacity
		
		System.out.println(v);
		
		System.out.println(v.size());   // returns no. of elements present at actual in the list
		
		// remove--> remove element based on index
		v.remove(4);
		System.out.println(v); // manipulation shifted to left remaining elements

		
		//for loop, for each, iterator, list-iterator, enumeration 
		
		// 1) for each loop/ enhanced loop
		System.out.println("=====for each/enhanced loop=====");
		for(Object f:v)
		{
		System.out.println(f);
		}
		
		// 2)iterator
		System.out.println("=====iterator=====");
		Iterator<Object> it = v.iterator();
		
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		
		// 3) List-iterator
		System.out.println("=====List-iterator=====");
		ListIterator<Object> li = v.listIterator();
		while(li.hasNext())
		{
		System.out.println(li.next());
		}
		
		System.out.println("=====enumeration=====");
		
		Enumeration<Object> enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}

	}

}
