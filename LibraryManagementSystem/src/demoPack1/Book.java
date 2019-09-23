package demoPack1;

public class Book 
{
	private String bookTitle;
	private String bookAuthor;
	private String bookType;
	
	public Book(String bookTitle, String bookAuthor, String bookType) 
	{
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookType = bookType;
	}
	
	@Override
	public String toString() 
	{
		return "The Book title is "+ this.bookTitle + " written by "+this.bookAuthor + " of genre "+this.bookType;
	}
	
	public String getBookTitle()
	{
		return bookTitle;
	}
	
	public String getBookAuthor()
	{
		return bookAuthor;
	}
	
	public String getBookType() 
	{
		return bookType;
	}
	
}