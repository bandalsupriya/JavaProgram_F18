package accessModifier;

public class parent extends demo
{
    int a=100;
	public static void main(String[] args)
	{
		parent p=new parent();
		//p.studentinfo();
		p.multiplication();

	}
	
	public void multiplication()
	{
		int a=50;
	
		System.out.println("value of local a "+a);
		System.out.println("value of a from parent class "+this.a);
		System.out.println("valiue of a form demo class "+super.a);
		System.out.println("addition of this a & super a is "+(this.a+super.a));
		//int add=this.a+super.a;
		//System.out.println(" value of add is "+add);
	}

}
