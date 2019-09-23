package demoPack1;
import java.util.Scanner;
public class Librarian
{

	public static void main(String[] args) 
	{
		BookDAOImplementation dao = new BookDAOImplementation();
		dao.insertBook(new Book("Sachin", "Arcus", "Biography"));
		dao.insertBook(new Book("Harry Potter", "J.K.Rowlings", "Fiction"));
		dao.insertBook(new Book("Fantastic Beasts", "J.K.Rowlings", "Fiction"));
		dao.insertBook(new Book("Fantastic Beasts", "Arcus", "Fiction"));
		
		dao.removeBook("Fantastic Beasts");
		
	}

}
