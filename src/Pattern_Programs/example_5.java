package Pattern_Programs;

public class example_5 {

	public static void main(String[] args) 
	{
		
	
		// *****
		//  ****
		//   ***
		//    **
		//     *
		
		//row-->5 columns-->5
		int space=0;// observe the 1st row
		int star=5; // observe the 1st row
		
	for(int i=1;i<=5;i++)     //outer for loop--> row
	{
		 //inner for loop for space and star
		for(int j=1;j<=space;j++)// for loop for space
		{
		System.out.print(" ");
		}
		for(int k=1;k<=star;k++)// for loop for star
		{
		System.out.print("*");
		}
		
		
		
		System.out.println();
		space++;
		star--;
	}
		
	}

}
