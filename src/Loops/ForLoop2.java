package Loops;

public class ForLoop2 {

	public static void main(String[] args) 
	{
		int a=14;
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println("=============================");
		//start-->1 end-->5-->1,2,3,4,5
		//initialization-->1
		//condition-->5--> >=40 <5--> <=5 <6
		//updation -->increment by 1
		// for(initialization;condition;updation)
		// {
		// //body
		// }
		for(int i=1;i<=5;i++)
		{
		//body
		System.out.println(a);
		}
		
		//I want to print Velocity 10 times
		//start end upadate?
		//start -->1, end->10 update by 1
		
		for(int j=1;j<=10;j++)
		{
		System.out.println("Velocity" + j);
		}
		//I want to print number 1-->10
		//start-->1 end-->10, update by 1
		

	}

}
