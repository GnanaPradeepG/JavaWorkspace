package demoPack1;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookDAOImplementation implements BookDAO
{

	private final static ArrayList<Book> bookList = new ArrayList<Book>();

	@Override
	public void insertBook(Book book) 
	{
		bookList.add(book);
	}	@Override
	public ArrayList<Book> searchBook(String bookAuthor) 
	{

		Iterator<Book> bookIterator = bookList.iterator();
		Book retrivedBook=null;
		String retrivedBookAuthor = null;
		ArrayList<Book> retrivedBookList = new ArrayList<Book>();

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
		Book retrivedBook = null;
		String retrivedBookTitle = null;
		ArrayList<Book> retrivedBookList = new ArrayList<Book>();

		for(int i=0; i<=bookList.size()-1 ; i++)
		{
			retrivedBook = bookList.get(i);
			retrivedBookTitle = retrivedBook.getBookTitle();
			if(bookTitle.equals(retrivedBookTitle))
			{
				retrivedBookList.add(retrivedBook);
			}
		}
		
		for(int i=0; i<=retrivedBookList.size()-1 ; i++)
		{
			retrivedBook = retrivedBookList.get(i);
			System.out.println(retrivedBook.getBookTitle()+" written by "+retrivedBook.getBookAuthor());
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter author name : ");
		String bookAuthor = scan.next();

		if(retrivedBookList.size()==0)
		{
			throw new BookNotFoundException(bookTitle);
		}
		else
		{
			for(int i = 0; i<=bookList.size()-1 ;i++)
			{
				retrivedBook = bookList.get(i);
				String retrivedBookAuthor = retrivedBook.getBookAuthor();
				if(retrivedBookTitle.equals(bookTitle) && retrivedBookAuthor.equals(bookAuthor))
				{
					bookList.remove(i);
					System.out.println(bookAuthor);
					break;
				}
			}
			System.out.println("Book is removed successfully...");
		}
	}
}





