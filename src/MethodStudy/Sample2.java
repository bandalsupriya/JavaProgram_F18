package MethodStudy;

public class Sample2 {

	public static void main(String[] args) 
	{
		Sample2 s2= new Sample2();// created object of sample2 class
		s2.m();// calling non-static method from sample2 class
		s2.m1(); //calling non-static method from sample2 class
		
		//to call non-static method from another class--> create object of that class
		Sample s= new Sample();// created object of another class
		s.display();// calling non-static methods from another class
		s.test();// calling non-static methods from another class
		s.display();
		}
		public void m()
		{
		System.out.println("Method m non-static from sample2");
		}
		public void m1()
		{
		System.out.println("Method m1 non-static from sample2");


	}

}
