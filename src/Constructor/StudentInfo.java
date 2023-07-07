package Constructor;

public class StudentInfo {
     String StudentName;    // Global variable declaration
     float marks;
     int rollNum;
     
	public StudentInfo()    // user defined constructor without parameter
	{
		StudentName = "Rupesh";
		marks = 95.5f;
		rollNum =435;
	}
	
	public StudentInfo(String X)    // user defined with single parameter constructor
	{
		StudentName=X;
		
		
	}
	
	public StudentInfo (String X,float Y)//user defined with TWO parameter constructor
	{
		StudentName=X;
		marks = Y;
	}
	
	public StudentInfo (String X,float Y,int Z)//user defined with THREE parameter constructor
	{
		StudentName=X;
		marks = Y;
		rollNum=Z;
	}
	
	
	public static void main(String[] args) // main method- static
	{
		StudentInfo S=new StudentInfo();  // create an object to call from sample method
		S.student();
		
		StudentInfo S1=new StudentInfo("Rupesh");// Single parameter
		S1.student();
		
		StudentInfo S2=new StudentInfo("vaibhav",99.5f);// TWO PARAMETER
		S2.student();
		
		StudentInfo S3=new StudentInfo("Mahesh", 85, 500);// three parameter
		S3.student();
		

	}
	
	
	public void student()   // Non-static method without parameter
	{
		
		System.out.println("student name is "+ StudentName);
		System.out.println("Student marks is "+ marks);
		System.out.println("student rollNum is "+rollNum);
		System.out.println("=============================");
	}

}
