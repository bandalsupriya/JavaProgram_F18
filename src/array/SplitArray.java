package array;

public class SplitArray {

	public static void main(String[] args) 
	{
		String M="I LOVE MY INDIA";
	      String[] M1 = M.split(" ");
	     // System.out.println(M1);
		//M1= {"I","LOVE","MY","INDIA"}
		System.out.println(M1.length);
		for(int i=0;i<=M1.length-1;i++)
		{
		System.out.print(M1[i]+" ");
		}
		System.out.println();

	}

}
