package MethodStudy;

public class Paramater {

	public static void main(String[] args) 
	{
		studentInfo();//calling static method without paramater from same class 
		
		Paramater P1 =new Paramater(); //create new object to call Non-static method
		P1.studentInfo("Mahesh",75.5f,325);  // calling Non-Static method ( new object.methodName)
		P1.studentInfo("Akash",55.5f,325);
		P1.studentInfo("Prakash",78,120);
		

	}
	
	public static void studentInfo() //static method without parameters
	{
	String studentName;
	float marks;
	int rollNum;
	
	studentName="Rupesh";
	marks=88.8f;
	rollNum=24;
	System.out.println("===========================");
	System.out.println("Student name is "+studentName);
	System.out.println("Student marks is "+marks);
	System.out.println("student rollNum is "+rollNum);
		System.out.println("==========================");
	}

	public void studentInfo(String studentName,float marks,int rollNum)// Non-static method with parameter
	{
	System.out.println("Student name is "+studentName);	
	System.out.println("Student marks is "+marks);
	System.out.println("student rollNum is "+rollNum);
	System.out.println("==================");
	}
	
}
