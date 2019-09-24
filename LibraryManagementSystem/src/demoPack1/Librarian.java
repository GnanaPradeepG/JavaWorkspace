package demoPack1;
import java.util.ArrayList;
import java.util.Scanner;

public class Librarian
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		BookDAO dao = Library.bookDAO();

		System.out.println("WELCOME TO LIBRARY MANAGEMENT SYSTEM...");
		String choice = null;
		do
		{
			System.out.println("Press 1 to insert book");
			System.out.println("Press 2 to search book");
			System.out.println("Press 3 to remove book");
			System.out.print("Enter your choice : ");

			int ip = scan.nextInt();
			if(ip >= 1 && ip <= 3)
			{
				if(ip == 1)
				{
					System.out.println("To insert a book please fill the following information : ");
					System.out.print("Book title is : ");
					String bt = scan.next();
					System.out.print("Book author is : ");
					String ba = scan.next();
					System.out.print("Book genre is : ");
					String bg = scan.next();
					dao.insertBook(new Book(bt,ba,bg));
					System.out.println("Book is inserted into library");
				}
				else if(ip == 2)
				{
					System.out.println("To search a book please enter the author name : ");
					String ba = scan.next();
					
					try
					{
						ArrayList<Book> retrivedBook = dao.searchBook(ba);
						
						for (int i = 0; i <= retrivedBook.size()-1 ; i++)
						{
							System.out.println(retrivedBook.get(i));
						}
					}
					catch(BookNotFoundException rv)
					{
						System.out.println(rv);
					}
					
				}
				else if(ip == 3)
				{
					System.out.println("To remove a book please enter the book title : ");
					String bt = scan.next();
					
					try
					{
						dao.removeBook(bt);
					}
					catch(BookNotFoundException rv)
					{
						System.out.println(rv);
					}
				}


				System.out.println("Do you want to continue or stop????   Y/N");
				choice = scan.next();
			}
			else
			{
				System.out.println();
				System.out.println("***=====Please enter valid value====***");
				System.out.println();
			}
		}
		while(choice.equals("y") || choice.equals("yes") || choice.equals("Y") || choice.equals("YES"));
		
		System.out.println("Thank you visit again...");
	}

}


