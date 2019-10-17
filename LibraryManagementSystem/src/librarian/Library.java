package librarian;

public class Library 
{
	public static BookDAO bookDAO() 
	{
		BookDAO library = new BookDAOImplementation();
		return library;
	}
}
