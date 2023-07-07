package inheritance;

public class customer extends employee 
{

	public static void main(String[] args) 
	{
		customer C1=new customer();
		C1.requirement();
		C1.eid();
		C1.address();
		
		cname();
		employee.ename();
		Company.name();
	
		

	}
	public static void cname()
	{
		System.out.println("customer name is louis");
	}
	public void requirement()
	{
		System.out.println("customer required software");
	}
}
