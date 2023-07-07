package MethodStudy;

public class Sample {

	public static void main(String[] args) 
	   {
		//to call non-static method we need to create object at-least once
		//how to create object
		// className objectName= new ClassName();
		Sample s= new Sample();// object s created 
		
		//how to call non-Static methods
		//objectName.methodName
		s.test();// calling non-Static method from same class
		s.display();//calling non-Static method from same class
		}
		public void test()// non static regular method
		{
		System.out.println("Non static regular method test-is running ");
		}
		public void display()// non-static regular method
		{
		System.out.println("HI GOOD MORNING");	

	}

}
