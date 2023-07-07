package array;

public class MultiDimensionalArray {

	public static void main(String[] args) 
	{
		// with new keyword
		
		int rollnum[][]=new int[2][2];     // 2x2 matrix  ( row-->0 ,row-->1)  ( column-->0 ,column-->1) 

		//    00-1     01-2     ... row... 0
		//    10-3    11-4     ... row... 1
		
		//  Clm0     Clm1
		
		
		rollnum[0][0]=1;
		rollnum[0][1]=2;
		rollnum[1][0]=3;
		rollnum[1][1]=4;
		
		System.out.println(rollnum[0][0]);
		System.out.println(rollnum[0][1]);
		System.out.println(rollnum[1][0]);
		System.out.println(rollnum[1][1]);
		
		System.out.println("==============");
		
		for(int i=0;i<=1;i++)        // outer loop-- for row-- first priority
		{
			for(int j=0;j<=1;j++)     // inner loop --- for column
			{
				System.out.print(rollnum[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
