package composition_2;

class Book
{
	String title;
	int pages;
	
	public Book(String title, int pages)
	{
		this.title = title;
		this.pages = pages;
	}
	public void openBook()
	{
		System.out.println("open the book " +this.title);
	}
	public void turnPage()
	{
		System.out.println("turn the pages "+ this.pages);
	}
	public void closeBook()
	{
		System.out.println("close the book" + this.title);
	}
}
