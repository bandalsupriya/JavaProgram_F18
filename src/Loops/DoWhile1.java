package Loops;

public class DoWhile1 {

	public static void main(String[] args) 
	{
		//TABLE OF 5
		
		int num=5;
		int i=1;

		do
		{
			System.out.println("("+num +"x"+i+")"+"="+(num+i));
			
	        i++;
	       
		}
	    while(i<=10);
		
		
		System.out.println("============");
	
	int sum=0;
	int n=500;
	int p=1;
	
	do
	{
		sum+=p;
		
		p++;
	}
	while(p<=n);
     System.out.println(sum);
	
}
}
