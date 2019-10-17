package composition_2;

class Author 
{
	String name;
	Book b ;
	Pen p;
	
	public Author(String name, Book b , Pen p)
	{
		this.name = name;
		this.b = b;
		this.p = p;
	}
	
	public void writeContent()
	{
		System.out.println("name of the author is " + this.name);
		b.openBook();
		p.write();
		b.turnPage();
		p.write();
		b.closeBook();
			
	}
}