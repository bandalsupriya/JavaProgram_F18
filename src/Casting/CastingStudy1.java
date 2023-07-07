package Casting;

public class CastingStudy1 {

	public static void main(String[] args) 
	{
		//short a=31200;
		//System.out.println(a);
		//byte b=(byte)a;
		//System.out.println(b);
		
		
		//int x=23378468;
		//System.out.println(x);
		//short y=(short)x;
		//System.out.println(y);
		
		//implicit casting--> lower-->higher, memory--> increases, No data loss
		int a=10;// a is of type int
		System.out.println(a);
		//lets convert into to double
		double b=a;
		System.out.println(b);
		//explicit casting higher-->lower, memory-->decreases, data loss is possible
		double p=123.789d;
		System.out.println(p);
		int q=(int) p;
		System.out.println(q);

	}

}
