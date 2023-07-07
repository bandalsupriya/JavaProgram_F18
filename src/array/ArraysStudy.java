package array;

public class ArraysStudy {

	public static void main(String[] args) 
	{
		
		
		// 1) Variable declaration        (0-1-2-3-4)=total capacity 5= no.of blocks
		String subject[]=new String[5];
		
		// 2) Variable initialization
		subject[0]="Maths";    // 
		subject[1]="Science";
		subject[2]="English";
		subject[3]="Marathi";
		subject[4]=null;
		
		//subject[5]="Algebra";     // non growable in nature Exception error-Out of bounds
		//subject[6]="Geometry";
		
		// 3) usage
		System.out.println("=====Array - string type =====");
		System.out.println(subject[0]);
		System.out.println(subject[1]);
		System.out.println(subject[2]);
		System.out.println(subject[3]);
		System.out.println(subject[4]);
		
		
		float marks[]=new float[4];  // 1) Variable declaration  //(0-1-2-3)=total capacity 4= no.of blocks
		
		marks[0]=55;                     // 2) Variable initialization
		marks[1]=65.5f;
		System.out.println("=====Array - float type =====");
		System.out.println(marks[0]);       // 3) usage
		System.out.println(marks[1]);
	}

}
