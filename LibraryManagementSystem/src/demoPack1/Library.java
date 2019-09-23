package demoPack1;

public class Library 
{
	public static BookDAO bookDAO() 
	{
		BookDAO library = new BookDAOImplementation();
		return library;
	}
}
