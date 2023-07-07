package Loops;

public class DoWhile {

	public static void main(String[] args) 
	{
		
		int j=10;
		do
		{
			System.out.println(j);
			j=j+10;
		}
		while(j<=100);
		
		System.out.println("=====condition is false after j>100======");
       
		// Odd number--> 1,3,5,6-- start from 1 and update by + 2
		// Even number--> 2,4,6,8-- start from 2 and update by + 2
		
		// print ODD number --> 1,3,5,7,9,11,.........50
		
		int r=1;
		do
		{
			System.out.println(r);
			r=r+2;
		}
		while(r<=50);
	}

}
