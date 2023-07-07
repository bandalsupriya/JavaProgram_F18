package collection_Study;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Use {

	public static void main(String[] args) 
	{
		TreeSet<Object> ts= new TreeSet<>();
		ts.add(10);
		//ts.add('F');
		//ts.add(null);
		ts.add(6);
		ts.add(8);
		ts.add(7);
		ts.add(11);
		System.out.println(ts);
		ts.add(16);
		System.out.println(ts);
		System.out.println(ts.ceiling(9));
		System.out.println(ts.floor(12));
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.higher(9));
		System.out.println(ts.lower(10));
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts.remove(19));
		
		//cant use--> for loop
	    // we can use only for each, iterator
		System.out.println("=====for each=====");
	    for(Object t:ts)
		{
		System.out.println(t);
		}
		System.out.println("=====iterator=====");
		Iterator<Object> it = ts.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}		
		
	}

}
