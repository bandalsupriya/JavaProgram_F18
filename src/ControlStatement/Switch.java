package ControlStatement;

public class Switch {

	public static void main(String[] args) 
	{
		char gender='M';
		switch (gender) {
		case 'M': 
		{
		System.out.println("its MALE");
		break;
		}
		case 'F':
		{
		System.out.println("its FEMALE");
		break;
		}
		case 'T' :
		{
		System.out.println("its TRANSGENDER");
		break;
		}
		default:
		{
		System.out.println("Please enter valid DATA");
		}
		}

	}
		

}
