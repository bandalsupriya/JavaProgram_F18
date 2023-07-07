package accessModifier;

public class demo {

	 int a=20;
	 String name ="Rupesh";
	
	public static void main(String[] args) 
	{
		demo d1=new demo();
		d1.studentinfo();

	}
	
	public void studentinfo()
	{
		int a=30;
		int b=40;
		int sum=a+b;
		System.out.println("Value of global variable a is "+this.a);
		System.out.println("addition of local value is "+sum);
		System.out.println("local value of a is "+a);
		System.out.println("Value of global variable a is "+this.a);
		System.out.println("student name is "+this.name);
		
		
	}

}
