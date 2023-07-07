package Loops;

public class Forloop6 {

	public static void main(String[] args)
	{
		
		int p=1; //enter your number
		for (int i=1; i<=p; i++) 
		{
		System.out.print(" ".repeat(p-i));
		for (int j=10; j>=i; j++) 
		{
		System.out.print("* ");
		}
		System.out.println();
		}

	}

}
