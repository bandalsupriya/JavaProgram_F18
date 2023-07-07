package Loops;

public class WhileLoop {

	public static void main(String[] args) 
	{
		// I need to print table of 10 in incremental order
		//start-->10 end--><=100 update-->i=i+10
		//1.initialization
		//2. while(condition)
		
		/*
		* {
		*   3.body to be executed
		*   updation
		* }
		* 
        */
		int i=10;
		while(i<=100)
		{
			System.out.println(i);
			i=i+10;
		}
		System.out.println("===condition is false after i>100");
		
		
		
		// I need to print table of 10 in decremental order
		int r=100;
		while(r>=10)
		{
			System.out.println(r);
			r=r-10;
		}
		System.out.println("==condition is false after r<10");
	}

}
