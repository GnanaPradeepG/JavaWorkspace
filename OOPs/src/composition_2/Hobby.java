package composition_2;

public class Hobby 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Author a = new Author("Arcus",new Book("HTML",69),new Pen("Black"));
		a.writeContent();
		System.out.println("================================");
		Author b = new Author("Pradeep", new Book("Java",45),new Pen("Blue"));
		b.writeContent();
	}

}