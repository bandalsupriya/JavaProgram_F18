package accessModifier;

public class Student {
    int a=20;
    String name ="Rupesh";
    
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.studentinfo();

	}

	
	public void studentinfo()
	{
		int a=30;
	
		
		System.out.println("local value of a is "+a);
		//System.out.println("addition of local value is "+sum);
		System.out.println("Value of global variable a is "+this.a);
		
		
	}
}
