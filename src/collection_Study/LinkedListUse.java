package collection_Study;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUse {

	public static void main(String[] args) 
	{
		
		
		LinkedList<String> ll= new LinkedList<>();
		ll.add("Pune");
		ll.add("Goa");
		ll.add("Nagpur");
		ll.add("Raigad");
		System.out.println(ll);
		ll.add(2, "Solapur");
		System.out.println(ll);
		ll.addFirst("Mumbai");
		System.out.println(ll);
		ll.addLast("NASHIK");
		System.out.println(ll);
		//ll.clear();
		//ll.clone();
		ll.contains("Pune");
		System.out.println(ll.element());
		System.out.println(ll);
		//ll.get(0);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);

		System.out.println(ll.pollFirst());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		ll.push("Delhi");
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println("===============================");
		
		//for loop, for each, iterator, listIterator
		System.out.println("=====for loop=====");
		for(int i=0;i<=ll.size()-1;i++)
		{
		System.out.println(ll.get(i));
		}
		System.out.println("=====for each loop=====");
		for(String l:ll)
		{
		System.out.println(l);
		}
		System.out.println("=====iterator=====");
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
		{

		System.out.println(it.next());
		}
		System.out.println("=====List iterator=====");
		ListIterator<String> li = ll.listIterator();
		while(li.hasNext())
		{
		System.out.println(li.next());
		System.out.println("===============================");
		
		}

	}

}
