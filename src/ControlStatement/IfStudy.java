package ControlStatement;

public class IfStudy {

	public static void main(String[] args) {
		
		
	    int marks=41; // If your marks greater than 40, -->You are pass
		if(marks>=40)
		 {
		 System.out.println("You are pass");
		 }
		
		
		String signal="green";    // if signal is not red --> go
		if(signal!="red")
		{
		System.out.println("go");
		}
		
		
		char gender='F';     // if gender is M --> You are male
		if(gender!='M')
		{
			System.out.println("You are male");
		}
		
		byte temp=0;   // if temp less than 0--> its cool
	    if(temp<2)
	    {
	    	System.out.println("its cool");
	    }
	
	}

}
