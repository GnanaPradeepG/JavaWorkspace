package librarian;

import java.util.ArrayList;

public interface BookDAO 
{
	void insertBook(Book book);
	ArrayList<Book> searchBook(String bookAuthor);
	void removeBook(String bookTitle);
}
