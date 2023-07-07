package collection_Study;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) 
	{
		
	// 1) List(I)
		// Implementation classes
		// 1) ArrayList
		
		// for calling methods of ArrayList class we need to create object/Instance of class(ArrayList)
		
		ArrayList<Object> al=new ArrayList<>(); //generic arrayList
		
		ArrayList<String>als= new ArrayList<>();//STring arrayList
		ArrayList<Integer>ala= new ArrayList<>();
		ArrayList<Float>alf= new ArrayList<>();
		ArrayList<Character>alc= new ArrayList<>();
		ArrayList<Boolean>alb= new ArrayList<>();
		
		System.out.println(al);   // o/p--> Array with blank having capacity 10
		
		     //1) add method
		
		al.add("Rupesh");      // 1--string
		al.add('R');           // 2--char
		al.add(46);            // 3--int
		al.add('R');           // 4--char
		al.add("Rupesh");      // 5--duplicate are allowed
		al.add(true);          // 6--boolean- true
		al.add(null);          // 7--allows any null value 
		al.add(null);          // 8--allows any null value 
		al.add(24.55f);        // 9--float
		al.add(123456789l);    // 10--long
		
		System.out.println(al);     // capacity is 10
		// data structure: Resizable--Automatically resize the capacity based on incremental capacity
		// Incremental capacity= (current capacity*3/2)+1=10*1.5+1=16
		al.add("Rupesh");  
		al.add('R'); 
		
		System.out.println(al);  // capacity is 16-- increased by Incremental capacity
		
		// storage type: index---> storing value at specified index
		
		al.add(5, "Never");
		System.out.println(al);   //manipulation right shifted remaining values and also theire index are changed
	   
		// 2) clear method--> recent array will be cleared
		//al.clear();
	    //System.out.println(al);
	    
	    // 3)clone method  --> to create duplicate arrayList --> return shallow copy
	    Object al2 = al.clone();
	    System.out.println(al2);   //return shallow copy of the recent arrayList
	    
	    // 4)contains method--> returns true if present or false
	    al.contains("Rupesh");
	    System.out.println( al.contains("Rupesh"));
	    System.out.println( al.contains(89));
	    
	    // 5).equal--> return true if both are same or equal
	    al.equals(al2);
	    System.out.println(  al.equals(al2));
	    
	    // 6) get--> gives o/p of particular index
	    al.get(2);
	    System.out.println(al.get(2));
	    
	    //al.get(50);
	    //System.out.println( al.get(50));    //  java.lang.IndexOutOfBoundsException
	    
	    
	    System.out.println(al);
	    // 7)Index of-->its return value of particular element /first occurence
	    System.out.println(al.indexOf("Rupesh"));
	    System.out.println(al.indexOf("Sachin"));  // if element not present then it gives -1
	    
	    // 8) last indexof-->return the index of the last occurence of 
	    //                   the specified element in this list
	     System.out.println(al.lastIndexOf("Rupesh"));
	     
	     // 9)remove--> base on index passing
	     //remove the element at the specified position in the list--/ left shift
	     System.out.println(al.remove(1));
	     System.out.println(al);
	     
	     //10) remove--> based on passing the Object/element
	     // remove the first occurence of specified element in this list if it is present 
	     // if remove remaining element will shift to left
	     // if element is not present in list then its gives false
	    
	     System.out.println(al.remove("Rupesh"));
	     System.out.println(al);
	     
	     //11) set-->Replaces the element at the specified position in this list withthe specified element.
	    System.out.println(al.set(3, "clever"));
	    System.out.println(al);
	    
	    // 12) size--> counts the number of element present in this list
	    System.out.println(al.size());
	}

}
