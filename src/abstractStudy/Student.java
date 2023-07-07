package abstractStudy;

public abstract class Student 
{

	public static void main(String[] args) 
	{
		

	}
	
	public void display1() // complete method from test class
	{
	System.out.println("display 1 method from test class");
	}
	
	public abstract void display2();// incomplete/abstract method from test class
	
	public static void demo1()
	{
	System.out.println("demo static method");
	}

}
