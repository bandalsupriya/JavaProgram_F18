package polymorphism;

public class RuntimeSon extends RuntimeFather 
{

	public static void main(String[] args) 
	{
		RuntimeFather RF=new RuntimeFather();
		RF.sample();
		
	

	}
	
	public void sample()
	{
		System.out.println("Son class Nonstatic method");
	}
	
	public static void demo()
	{
		System.out.println("child class");
	}
	

}
