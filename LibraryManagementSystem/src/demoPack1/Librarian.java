package demoPack1;
import java.util.Scanner;
public class Librarian
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		BookDAO dao = Library.bookDAO();

		System.out.println("WELCOME TO LIBRARY MANAGEMENT SYSTEM...");
		String choice = "y";
		while(choice.equals("y") || choice.equals("yes") || choice.equals("Y") || choice.equals("YES"))
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
					System.out.println(dao.searchBook(ba));
				}
				else if(ip == 3)
				{
					System.out.println("To remove a book please enter the book title : ");
					String bt = scan.next();
					dao.removeBook(bt);
					System.out.println("debug");
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
		System.out.println("Thanks you visit again...");
	}

}


