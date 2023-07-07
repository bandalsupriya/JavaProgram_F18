package collection_Study;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Use {

	public static void main(String[] args) 
	{
		LinkedHashSet<Object> lh= new LinkedHashSet<>();
		lh.add(12);
		lh.add(14);
		lh.add(14);
		lh.add(10);
		lh.add(13);
		lh.add(15);
		lh.add(null);
		lh.add(null);
		System.out.println(lh);
		//cant use--> for loop
		// we can use only for each, iterator
		System.out.println("=====for each=====");
		for(Object l:lh)
		{
		System.out.println(l);
		}
		System.out.println("=====iterator=====");
		Iterator<Object> it = lh.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}

	}

}
