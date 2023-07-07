package stringStudy;

public class String1 {

	public static void main(String[] args) 
	{
		//1)Length--> Count of Characters---(Return type=int)
		System.out.println("=======1)Length=========");
		String a="Rupesh";
		String a1="  ";  // count space is 2 time --- no. of blocks is 2
		//String a2=null;  // Exception-NullPointerException=Termination of code ( null does not have value)
		System.out.println(a1.length());
		System.out.println(a1.length());
		System.out.println(a.length());
		//System.out.println(a2.length());
		System.out.println(a.length());
		int lenghtOfString=a.length();   //(storing value for further use with new variable)
		int LenghtOfString1 = a1.length();
		System.out.println("the lenghth of the string is "+LenghtOfString1);
		System.out.println("The string lenght is "+lenghtOfString);
		System.out.println("The string lenght is "+(lenghtOfString+lenghtOfString));
		
		
		//2)toUppercase-->Converts all of the characters in this String to uppercase(Retuen type-String)
		System.out.println("=======2)toUppercase=========");
		String b1="pune city";
		System.out.println(b1.toUpperCase());
		 String Uppercase = b1.toUpperCase(); //(storing value for further use with new variable)
		System.out.println("conversion of lower to upper is "+Uppercase);
	    System.out.println(Uppercase.toLowerCase());
	  
	    
	    //3)toLowercase-->touppercase is converted to lowercase
	    System.out.println("=======3)toLowercase=========");
	    String f1=new String("PUNE CITY");
	    System.out.println(f1.toLowerCase());
		String ToLo = f1.toLowerCase();
		System.out.println("value of loweercase is "+ToLo);
		System.out.println(ToLo + "+"+ToLo);
		
		//4)equals-->
		System.out.println("=======4.2)equal to equal (==)=========");
		  // equal to equal (==)-->address comparision
		String B1="pune";    // Without new keyword--(Stored in constant pool Area)
		String B2="pune";// Without new keyword--(Stored in constant pool Area)
		
		String B3=new String("pune");  // With new keyword--(Stored in non-constant pool Area)
		String B4=new String("pune");  // With new keyword--(Stored in non-constant pool Area)
		String B5=new String("Pune");
		
		System.out.println(B1==B2); //equal to equal (==)--> GIVE Boolean value (True or false)
		System.out.println(B1==B3); // false memory location of both are different(constant pool Area & non-constant pool Area)
		System.out.println(B3==B4); // True memory location of both are different(non-constant pool Area & non-constant pool Area)
		System.out.println("=======4)equals=========");
		//equals--> It checks character sequence and case(Upper & lower) checks content not checks address
		System.out.println(B1.equals(B2));
		System.out.println(B1.equals(B3));
		System.out.println(B1.equals(B4));
		System.out.println(B1.equals(B5)); // False->case(Upper & lower) checks content
		
		//5)equalIgnoreCase->Compairing String with another String ignoring case(Upper & Lower case)
		System.out.println("=======5)equalIgnoreCase=========");
		String r1="pune";
		String r2=new String("PuneCity");
		String r3=new String("PUNE");
		System.out.println(r1.equalsIgnoreCase(r2));  //charecter diff. same and ignoring case
		System.out.println(r1.equalsIgnoreCase(r3));  //charecter same and ignoring case
	
		//6)contains-->Cheking the contains of string(Also cheks specified sequence,space and its case sensitive)
		System.out.println("=======6)contains=========");
		String t1=new String("PuneCity");
		System.out.println(t1.contains("e"));
		System.out.println(t1.contains(" "));
		System.out.println(t1.contains("Py"));
		System.out.println(t1.contains("U")); // CASE SENSITIVE
		
		//7)isEmpty-->return true if length is zero
		System.out.println("=======7)isEmpty=========");
		String K1=new String("PUNE CITY");
		String K2=new String("");    // ZERO 
		//String K3=null;
		
		System.out.println(K1.isEmpty());
		System.out.println(K2.isEmpty());
		//System.out.println(K3.isEmpty());//null pointer exception
		
		//8)charAt--> return the char. value at specified index
		System.out.println("=======8)charAt=========");
		String g1=new String("Velocity is in pune");
		System.out.println(g1.charAt(0));
		System.out.println(g1.charAt(18));
		//System.out.println(g1.charAt(-2));  //StringIndexOutOfBoundsException---->if out of range
		
		String g2=new String("Velocity 401");  //all are character
		System.out.println(g2.charAt(10));
		
		//9)endsWith-->test if this string is ends with specified suffix
		System.out.println("=======9)endsWith=========");
		String v1=new String("PUNE CITY");
		System.out.println(v1.endsWith("Y"));
		System.out.println(v1.endsWith("ITY"));
		System.out.println(v1.endsWith("IT"));
		System.out.println(v1.endsWith("y"));
		
		//10)startsWith-->test if this string is starts with specified suffix
		System.out.println("=======10)startsWith=========");
		String h1=new String("PUNE CITY");
		System.out.println(h1.startsWith("PUNE"));
		System.out.println(h1.startsWith("pune"));
		System.out.println(h1.startsWith("UNE"));
		System.out.println("=======toOffset=========");
		//toOffset-->where to begin looking in this string
		String h2=new String("PUNE CITY PUNE");
		System.out.println(h2.startsWith("PUNE",10));
		System.out.println(h1.startsWith("NE CITY", 2));
	
		
		//11)subString-->taking one perticuler part from given string(from existing string & must be in sequence)
		System.out.println("=======11)subString=========");
		String z1=new String("PUNE CITY");
		System.out.println(z1.substring(1));  //begin index-->from where to start
		System.out.println(z1.substring(3));
		
		System.out.println(z1.substring(3, 8));//start index & end index-1..(always take endindex+1)
		System.out.println(z1.substring(1,4));
		//12)concat--> joining two or more string with the help of concat
		System.out.println("=======12)concat=========");
		String S1=new String("PUNE ");
		String S2=new String(" CITY");
		System.out.println(S1.concat(S2));
		System.out.println(S1 .concat(S2).concat(S1).concat("VELOCITY"));
		
		System.out.println(S1.concat(S2).concat("is love")); // can declare own string and concat multiple string
		
		// 13)indexOf-->return the index within this string of the first occurence of specified charecter
		System.out.println("=======13)indexOf=========");
		String L1="Hello";
		System.out.println(L1.indexOf('e'));
		System.out.println(L1.indexOf('l',3)); // if same letter occure in string then specified them with theire index
		System.out.println(L1.indexOf('o'));
		System.out.println(L1.indexOf('H'));
		System.out.println(L1.indexOf('e'));
		System.out.println(L1.indexOf('n'));   // garbage value   = always -1
		System.out.println(L1.indexOf('z'));    // garbage value  = always -1
		System.out.println(L1.indexOf('O'));   // CASE SENSITIVE // garbage value  = always -1
		
		// 14)LastIndex--> start the indexing from starting but taking last value
		System.out.println("=======14)LastIndex=========");
		String A1="Looks Good Now,ok go front";
		System.out.println(A1.lastIndexOf('o'));
		
		String A2="Good morning";
		System.out.println(A2.lastIndexOf('o'));
		System.out.println(A2.lastIndexOf('o',2));
		System.out.println(A2.lastIndexOf('G'));
		System.out.println(A2.lastIndexOf('D'));
		
		// 15) Replace--> you can replace single charecter & whole string
		System.out.println("=======15) Replace=========");
		String d1="Cat";
		System.out.println(d1.replace('C', 'M'));
		String d2="Cat Car Cotton";
		System.out.println(d2.replace('C','R'));  // single charecter
		System.out.println(d2.replaceAll("Ca","A")); // multiple charecter 
		System.out.println(d2.replace("Ca", "a"));
		
		String d3="Cat tvCar Catton";
		//System.out.println(d3.replace("aa", "b"));
		System.out.println(d3.replace("Ca", "a"));
		//System.out.println(d3.replace("Goo", "r"));
		//System.out.println(d3.replace("od", "t"));
		//System.out.println(d3.replace("oo", "q"));
		
		System.out.println(d3.replace("Ca","v"));
		
		String d4="AAAAA";
		System.out.println(d4.replace("AA","b"));  // replace sequence-->start replacing from starting by sequence 
		System.out.println(d4.replaceAll("AA","b")); 
		
		// 16) split--> string divided into substring on the basis of given format or i/p
		System.out.println("=======16) split=========");
		// String[]-->String Array-->Stored Multiple string 
		
		String M="I LOVE MY INDIA";
		System.out.println(M.split(M));
		String[] M1 = M.split(" ");
		System.out.println(M1);
		
		
		
		
	}
}