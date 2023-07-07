package collection_Study;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetUse {

	public static void main(String[] args) 
	{
		HashSet<Object> hs= new HashSet<>();
		hs.add("Pune");
		hs.add("Mumbai");
		hs.add("Nagpur");
		hs.add("Pune");
		hs.add("Delhi");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		// hs.clear();
		// System.out.println(hs);
		//hs.clone();
		//System.out.println(hs.contains("Mumbai1"));
		//System.out.println(hs.isEmpty());
		System.out.println(hs.remove("Pune"));
		System.out.println(hs);
		System.out.println(hs.size());

		//traversing through HashSet
		//we cant use get Method-->for loop--> because it does not support indexing
		//we can use only for each and iterator
		System.out.println("=====for each loop=====");
		for(Object h:hs)
		{
		System.out.println(h);
		}
		System.out.println("=====iterator=====");
		Iterator<Object> it = hs.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
	}

}
