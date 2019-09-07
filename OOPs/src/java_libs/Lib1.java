package java_libs;
 

class Lib1 {

	public static void main(String[] args) 
	{
		//  by default object class is the super class
		Lib1 rv1 = new Lib1();
		String s1 = rv1.toString();	
		//storing toString() methods returning data to a variable s1  
		System.out.println(rv1.toString());
		Lib1 rv2 = new Lib1();
		System.out.println(rv2.toString());//can call a method in a print statement
		System.out.println(rv1.equals(rv2));
		System.out.println(Math.pow(4, 2));
		
	}
}
