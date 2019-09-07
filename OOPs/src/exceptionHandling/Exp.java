package exceptionHandling;
import java.util.Scanner;
public class Exp
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the 2nd number");
		int b = scan.nextInt();
		
		while(true)
		{
			try
			{
				System.out.println(a/b);
				break;
			}
			
			catch(ArithmeticException rv)
			{
				System.out.println("Invalid value entered re-enter");
				b = scan.nextInt();
			}
		}
		
	}

}

