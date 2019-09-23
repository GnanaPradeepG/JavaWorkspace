package demoPack1;
 
public class BookNotFoundException extends RuntimeException 
{
	String BookData;

	public BookNotFoundException(String bookData) 
	{
		BookData = bookData;
	}
	
	
	@Override
	public String toString() 
	{
		return "BookNotFoundException : "+this.BookData+" book is not found";
	}
	
}