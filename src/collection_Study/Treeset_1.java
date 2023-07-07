package collection_Study;

import java.util.TreeSet;

public class Treeset_1 {

	public static void main(String[] args) 
	{
		TreeSet<Object> ts= new TreeSet<>();
		
		ts.add(12);
		ts.add(10);
		ts.add(30);
		//ts.add("Rupesh");     --> ClassCastException
		ts.add(12);
		ts.add(11);
		ts.add(26);
		System.out.println(ts);    // order--. Ascending
		//ts.add(null);  // NullPointerException
		
		// ceiling--> roundof to next value if given value is not present
		ts.ceiling(13);
		System.out.println(ts.ceiling(13));
		
		
		//ts.descendingIterator();
		//System.out.println(ts.descendingIterator());
		
		
		// floor--> reverse of ceilling method
		ts.floor(13);
		System.out.println(ts.floor(13));
		
		// first--> o/p zero index--> first element
		ts.first();
		System.out.println(ts.first());
		
		// last--> reverse of first
		ts.last();
		System.out.println(ts.last());
		
		// higher--> greter value of i/p
		ts.higher(12);
		System.out.println(ts.higher(12));
		
		
		// lower--> reverse of higher
		//ts.lower(12);
		//System.out.println(ts.lower(12));
		
		System.out.println(ts);
		
		// pollfirst--> 
		ts.pollFirst();
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		
		
		// poll last 
		
		
		

	}

}
