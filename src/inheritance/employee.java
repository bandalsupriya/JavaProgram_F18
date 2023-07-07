package inheritance;

public class employee extends Company 
{

	public static void main(String[] args)
	{
		employee E=new employee();
		E.address();
		E.eid();
		ename();
		Company.name();
		

	}
	
	public static void ename()
	{
		System.out.println("employee name is Rupesh");
	}
	public void eid()
	{
		System.out.println("employee id is 12345");
	}

}
