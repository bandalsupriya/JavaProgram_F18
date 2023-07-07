package Pattern_Programs;

public class example_4 {

	public static void main(String[] args) 
	{
		
		// *****
		// ****
		// ***
		// **
		// *
		
		// row --------> 5  ----- Outer loop
		// column -----> 5  ----- Inner loop
		
		
		int star=5;
		
		for(int i=1;i<=5;i++)            // Outer Loop--> for row
		{
			for(int j=1;j<=star;j++)      // Inner loop--> for column
			{
				System.out.print("*");
			}
			System.out.println();
			star--;   // 5,4,3,2,1
		}
	}
		

}
