package exceptionHandling;
import java.util.Scanner;
public class Exp2 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
		int val = s.length();//used to know the length of String
		System.out.println("enter the index no. index number should be in range of [ 0-"+(val-1)+" ]");
		int index = scan.nextInt();
		char ch;
		while(true)
		{
			try
			{
				ch = s.charAt(index);
				break;
			}
			catch(StringIndexOutOfBoundsException rv)
			{
				System.out.println("Index number out of range re-enter in range of [ 0-"+(val-1)+" ]");
				index = scan.nextInt();
				
			}
		}
		
		System.out.println(ch);
		
	}
}