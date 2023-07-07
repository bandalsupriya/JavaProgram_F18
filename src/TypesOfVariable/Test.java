package TypesOfVariable;

public class Test {

	int b=90;          //global variable non-static
	static int c=80;   //global static variable

	
	public static void main(String[] args) 
	{
		Test t= new Test();
		t.display();//10
		t.display1();//20
		System.out.println("value of static variable from same class c is "+c);
		int sum=10+c;// usage of static variable from same class
		System.out.println("Sum is "+sum);
		System.out.println("value of non-static variable from same class b is "+t.b);
		int sub=100-t.b;// usage of non-static variable from same class
		System.out.println("Sub is "+sub);
		//how to use global variable form another class
		//calling static global variable from another class
		System.out.println("calling static global variable q from demo class"+Demo.q);
		//usage static global variable from another class
		int mul=10*Demo.q;
		System.out.println("mul is "+mul);
		//calling non-static global variable from another class
		Demo d= new Demo();// creating object of another class
		System.out.println("calling non-static global variable p from demo class "+d.p);
		//usage non-static global variable from another class
		float div=100/d.p;
		System.out.println("div is "+div);

	}

	public void display()
	{
	int a=10;//local variable
	System.out.println("local value of a is "+a);
	System.out.println("local value of b is "+b);
	}
	public void display1()
	{
	int a=20;//local variable
	System.out.println("local value of a is "+a);
	System.out.println("local value of b is "+b);
	int addition=10+c;//using global static variable in non static method
	int substraction=100-b;
	}
	public static void display2()
	{
	int add=100+c;
	//int multiplication=10*t.b;
	}

	
}
