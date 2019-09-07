package exceptionHandling;
import java.util.Scanner;
public class Exp2 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
		System.out.println("enter the index no.");
		int index = scan.nextInt();
		char ch;
		System.out.println(s.length());//used to know the length of String
		
		while(true)
		{
			try
			{
				ch = s.charAt(index);
				break;
			}
			catch(StringIndexOutOfBoundsException rv)
			{
				System.out.println("Index number out of range re-enter in range of [ 0-");
				index = scan.nextInt();
				
			}
		}
		System.out.println(ch);
	}

}
