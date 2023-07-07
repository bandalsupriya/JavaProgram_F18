package Loops;

public class ForLoop3 {

	public static void main(String[] args) 
	{
		int p=10; //enter your number
		for (int i=1; i<=p; i++) 
		{
		System.out.print(" ".repeat(p-i));
		for (int j=1; j<=i; j++) 
		{
		System.out.print("* ");
		}
		System.out.println();
		}
	
		
		
		
  }

}
