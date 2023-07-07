package InterfaceStudy;

public class Use implements Interface2,Interface1
{

	public static void main(String[] args) 
	{
		Use u=new Use();
		u.plain();
		Interface1.car();
		Interface2.car();

	}

	@Override
	public void sample() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void plain() 
	{
		
		Interface1.super.plain();
		Interface2.super.plain();
	}
	
	

	
}
