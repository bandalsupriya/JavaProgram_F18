package Pattern_Programs;

public class example_6 {

	public static void main(String[] args) 
	{
		
	    //     *
	    //    **
	    //   ***
	    //  ****
	    // *****
		
		//rows-->5 columns-->5
		int star=1;
		
		int space=4;// observe the 1st row
		//outer for loop--> row
	for(int i=1;i<=5;i++)
	{
		//inner for loop--> columns
		for(int j=1;j<=space;j++)// for loop for space
		{
		System.out.print(" ");
		}
		for(int k=1;k<=star;k++)// for loop for star
		{
		System.out.print("*");
		}
		
		
		
		System.out.println();
		space--;  // 4,3,2,1
		star++;   // 1,2,3,4
		
	}

	}

}
