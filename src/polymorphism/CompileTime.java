package polymorphism;

public class CompileTime {

	public static void main(String[] args) 
	{
		CompileTime CT=new CompileTime();
		CT.test();
		CT.test(10, 10);
		CT.test(20, 20);
		CT.test(30, 30);
	
	

	}
	
	public void test()      //zero parameter
	{
		int a=50;
		final int b=60;	
	
		int sum=a+b;
		System.out.println("with zero parameter"+sum);
	}
	
	public void test(int a,int b)  //two parameter
	{
		System.out.println("addition of a & b is  "+(a+b));
	}
	
	public void test(int a,float b)
	{
		System.out.println("addition of a & b is "+(a+b));
	}
	
	
	public void test(float a,int b)
	{
		System.out.println("addition of a & b is "+(a+b));
	}

}
