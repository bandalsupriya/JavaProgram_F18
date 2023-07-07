package ControlStatement;

public class NestedIfElse {

	public static void main(String[] args) 
	{
		int age=18;
		
	
		if(age==18)
			
		{
			System.out.println("you are eligible,please enter your age");
			
			if(age!=18)
			{
				System.out.println("you are eligible to work");
				System.out.println("please fill in your details & apply");
			}
			else
			{
				System.out.println("you cant apply,please enter valid age");
			}
		}
		
		else
		{
			System.out.println("you are minor");
		}
		

	}

}
