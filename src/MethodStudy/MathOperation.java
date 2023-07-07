package MethodStudy;

public class MathOperation {

	public static void main(String[] args) 
	{
		//create object of a class to call non-static method
		//ClassName ObjectName= new ClassName();
		MathOperation mo= new MathOperation();// create object of a class
		mo.addition();//calling non-static method from same class 
		
		substraction();//calling static method from same class 
		}
	
	
		public void addition()// non-static regular method
		{
		int a;
		int b;
		int sum;
		a=50;
		b=50;
		sum=a+b;
		System.out.println("Addition of a and b is "+sum);
		}
		
		
		public static void substraction()// static regular method
		{
		int p;
		int q;
		int sub;
		p=100;
		q=50;
		sub=p-q;
		System.out.println("Substraction of p and q is "+sub);
		}


}
