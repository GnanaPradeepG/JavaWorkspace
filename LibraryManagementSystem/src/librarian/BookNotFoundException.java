package librarian;
 
public class BookNotFoundException extends RuntimeException 
{
	private String bookData;

	public BookNotFoundException(String bookData) 
	{
		this.bookData = bookData;
	}
	
	
	@Override
	public String toString() 
	{
		return "BookNotFoundException : "+this.bookData+" book is not found";
	}
	
}