package array;

import java.util.Arrays;

public class SingleDimensional {

	public static void main(String[] args) 
	{
		//Single Dimensional with new keyword
		
		char letter[]=new char[5];
		letter[0]='A';
		letter[1]='B';
		letter[2]='C';
		letter[3]='D';
		letter[4]='E';

		System.out.println("=====Single Dimensional with new keyword=====");
		System.out.println(letter[0]);
		System.out.println(letter[1]);
		System.out.println(letter[2]);
		System.out.println(letter[3]);
		System.out.println(letter[4]);
		
		// using for loop
		System.out.println("=====using for loop=====");
		
		System.out.println(letter.length);  // to find out length
		
		for(int i=0;i<=letter.length-1;i++)   // 0-1-2-3-4
		{
			System.out.println(letter[i]);
		}
		
		// Ascending and Descending AND use of Arrays.sort
		
		System.out.println("=====Ascending and Descending AND use of Arrays.sort=====");
		char letter1[]=new char[5];
		letter1[0]='A';
		letter1[1]='C';
		letter1[2]='E';
		letter1[3]='D';
		letter1[4]='B';
		System.out.println(letter1.length);         // to find out length
		
		Arrays.sort(letter1);
		
		System.out.println("=====Ascending by using Arrays.sort=====");
		for(int i=0;i<=letter1.length-1;i++)        // 0-1-2-3-4
		{
			System.out.println(letter1[i]);
		}
		
		System.out.println("=====Descending by using Arrays.sort=====");
		for(int i=letter1.length-1;i>=0;i--)        // 4,3,2,1,0
		{
			System.out.println(letter1[i]);
		}
		
		
	}

}
