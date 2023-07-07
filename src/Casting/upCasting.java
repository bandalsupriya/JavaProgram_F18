package Casting;

public class upCasting {

	public static void main(String[] args) 
	{
		father f= new father();
		f.car();
		f.bike();
		System.out.println("===============");
		//int a=10;
		//float b= a;
		son s= new son();
		s.car();
		s.bike();
	
		s.degree();
		System.out.println("=======upcasting========");
		father f1= new son();  // craeted object of sub class and gave reference of super class
		f1.bike();
		f1.car();
		
		//f1.degree();     // using upcasting we can call common-->overrided properties 
                            // not a common property
	}

}
