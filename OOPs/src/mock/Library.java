
package mock;

public class Library 
{

	public static void main(String[] args) 
	{
		Book rv1 = new Book("HTML", "Arcus", 60);
		Book rv2 = new Book("HTML", "Pradeep", 60);
		Book rv3 = new Book("CSS", "Ravi", 89);
		rv1.print();
		System.out.println("======================");
		rv2.print();
		System.out.println("======================");
		rv3.print();
	}

}
