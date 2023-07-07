package polymorphism;

public class RuntimeSon2 extends RuntimeSon
{

	public static void main(String[] args) 
	{
		RuntimeFather RF=new RuntimeFather();
		RF.sample();
		RuntimeSon RS=new RuntimeSon();
		RS.sample();
		RuntimeSon2 RS2=new RuntimeSon2();
		RS2.sample();

	}
	public void sample() 
	{
		System.out.println("Son2 class Nonstatic method");
	}

}
