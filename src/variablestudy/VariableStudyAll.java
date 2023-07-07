package variablestudy;

public class VariableStudyAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student Info
		
		//name, rollNum, gender, age, presentStatus(present=true,absent=false), %marks
		//variable declaration
		String StudentName;
		int rollNum;
		char gender;
		float age;
		boolean presentStatus;
		double marks;
		
		//variable initialization
		StudentName="Rupesh";
		rollNum=10;
		gender='M';
		age=24.5f;
		presentStatus=true;
		marks=95.95d;
		
		//usage
		System.out.println("My Name is "+StudentName);
		System.out.println("My rollNumber is "+rollNum);
		System.out.println("My gender is "+gender);
		System.out.println("My age is "+age);
		System.out.println("My todays present status is "+presentStatus);
		System.out.println("My marks are "+marks);
	
	}
}
