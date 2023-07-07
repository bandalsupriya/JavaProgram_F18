package abstractStudy;

public class B extends A
{

	public static void main(String[] args) 
	{
		B b=new B();
	     b.test();
	     b.test2();
	     b.test();
	     b.test2();

	}
	
	void test()
	{
		System.out.println("completed method");
	}
	
	void test2()
	{
		System.out.println("complete method from same class");
	}
	
	
	

}
