package Pattern_Programs;

public class example_2 {

	public static void main(String[] args) 
	{
		// *****        row-->1            11 12 13 14 15
		// *****        row-->2            21 22 23 24 25
		// *****        row-->3            31 32 33 34 35
		
	 //  column-->5
		// row x column -----> 3 x 5 matrix
		// row-->3----------------> Outer Loop
		// column-->5-------------> Inner loop
		// use Nested for loop
	 
		for(int i=1;i<=3;i++)             // Outer Loop--> for row
		{
			for(int j=1;j<=5;j++)         // Inner loop--> for column        
			{
				System.out.print("*");      // print--> same line
			}
			System.out.println();        // println--> next line
		}
		
		
	}

}
