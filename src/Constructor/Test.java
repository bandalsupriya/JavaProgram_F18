package Constructor;

public class Test {
	int a=5;
	int b=6;
	int sum;
	// public Test()
	// {
	// //default constructor 
	// }
	public Test()
	{
	a=10;
	b=20;
	//user defined constructor-without parameter
	System.out.println("HI user defined constructor-without parameter is called");
	}
	public Test(int m)
	{
	a=m;
	//b=0 by default--> we are passing only one parameter
	}
	

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.addition();
		Test t1= new Test(40);
		t1.addition();
		
	}
	public void addition()
	{
		sum=a+b;
		System.out.println("Addition is "+sum);

	}

}
