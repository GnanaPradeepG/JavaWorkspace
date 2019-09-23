package demoPack1;

import java.util.ArrayList;
import java.util.Iterator;

public class BookDAOImplementation implements BookDAO
{

	private final static ArrayList<Book> booklist = new ArrayList<Book>();
	
	@Override
	public void insertBook(Book book) 
	{
		booklist.add(book);
	}	@Override
	public ArrayList<Book> searchBook(String bookAuthor) 
	{
		ArrayList<Book> retrivedBookList = new ArrayList<Book>();
		Iterator<Book> bookIterator = booklist.iterator();
		Book retrivedBook=null;
		String retrivedBookAuthor = null;
		
		while(bookIterator.hasNext())
		{
			retrivedBook = bookIterator.next();
			retrivedBookAuthor = retrivedBook.getBookAuthor();
			if(retrivedBookAuthor.equals(bookAuthor))
			{
				retrivedBookList.add(retrivedBook);
			}
		}
		int retrivedBookListSize = retrivedBookList.size();
		if(retrivedBookListSize == 0)
		{
			throw new BookNotFoundException(bookAuthor);
		}
		else
		{
			return retrivedBookList;
		}
			
	}

	@Override
	public void removeBook(String bookTitle)
	{
		Iterator<Book> bookIterator = booklist.iterator();
		Book retrivedBook = null;
		String retrivedBookTitle = null;
		ArrayList<Book> retrivedBookList = new ArrayList<Book>();
		
		while(bookIterator.hasNext())
		{
			retrivedBook = bookIterator.next();
			retrivedBookTitle = retrivedBook.getBookTitle();
			
			if(retrivedBookTitle.equals(bookTitle))
			{
				retrivedBookList.add(retrivedBook);
			}
			
		}
		
		int retrivedBookListSize = retrivedBookList.size();
		System.out.println();
		Iterator<Book> list = retrivedBookList.iterator();
		
	}
		
}







