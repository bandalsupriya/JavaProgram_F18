package Pattern_Programs;

public class example_3 {

	public static void main(String[] args) 
	{
		// *             // 1 1
		// **
		// ***
		// ****
		// *****
		
		
		
		// row --------> 5  ----- Outer loop
		// column -----> 5  ----- Inner loop
		
		
		int star=1;
		
		for(int i=1;i<=5;i++)   // 1,2,3,4,5,6        // Outer Loop--> for row
		{
			for(int j=1;j<=star;j++)   // Inner loop--> for column
			{
				System.out.print("*");
			}
			System.out.println();
			star++;   // 2,3,4,5
		}

	}

}
