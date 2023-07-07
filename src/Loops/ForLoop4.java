package Loops;

public class ForLoop4 {

	public static void main(String[] args) 
	{
		// I need to print table of 10 in incremental order
		// start-->10 end-->10 update-->10
		for(int i=10;i<=100;i=i+10)   // 10,20,30......100,110
		{
		System.out.println(i);//10,20,.....80,90,100
		}
		System.out.println("condition is over upto 100");
		
		System.out.println("===========================");
		
		
		// I need to print table of 10 in decremental order
		// start-->100 end-->10 update-->10
		for(int i=100;i>=10;i=i-10)// 100,90,80........20,10,0
		{
		System.out.println(i);    //100,90,80,70...20,10
		}
        System.out.println("condition false at 0 value of i");
	}

	
}
