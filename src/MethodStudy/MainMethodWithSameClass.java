package MethodStudy;

public class MainMethodWithSameClass {

	public static void main(String[] args) 
	{
		System.out.println("Main method is running");
		
		//  static method call from same class 
		// to call static method from same class --> directly call static method ie. methodname();
		demo();	
		
		demo();
		demo();
		LongUse.main(args);
	}
	
	
	public static void demo()  // defining  static method 
	{
		System.out.println("hi i am demo method from same class");
	}


	}


