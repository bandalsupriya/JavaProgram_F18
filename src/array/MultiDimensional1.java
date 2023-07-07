package array;

public class MultiDimensional1 {

	public static void main(String[] args) 
	{
		
		// without using new keyword
		int rollNum[][]= {{1,2,3},{4,5,6},{7,8,9}};   // row=3  , column= 3  [3x3=matrix]
		
		for(int i=0;i<=2;i++)    // outer loop---> for row
		{
		  for(int j=0;j<=2;j++)   //  inner loop---> for column
		  {
			  System.out.print(rollNum[i][j]+" ");
		  }
		  System.out.println();
		}

	}

}
