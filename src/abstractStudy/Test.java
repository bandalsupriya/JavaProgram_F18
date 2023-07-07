package abstractStudy;

public class Test extends Student 
{

	public static void main(String[] args) 
	{
		Test s= new Test();
		s.display1();// calling method from test class
		s.display2();// calling abstract method, completed in sample class
		s.display3();// calling sample class's own method

	}
	@Override
	public  void display2() // incomplete method from test class, completed in sample class
	{
	System.out.println("Display 2 method from test class completed in sample class");
	}
	
	public void display3()// sample class's own method
	{
	System.out.println("Display3 method from sample class");
	}

}
