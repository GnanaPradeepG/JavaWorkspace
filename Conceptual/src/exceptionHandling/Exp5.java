package exceptionHandling;
import java.util.Scanner;

public class Exp5 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("starts");
		int a = scan.nextInt();
		int b = scan.nextInt();
		while(true)
		{
			try
			{
			div(a,b);
			break;
			//even throws  is not specified exception travels to here(unchecked method)
			}
			catch(ArithmeticException e)
			{
				System.out.println("deno should be non zero value");
				b = scan.nextInt();
			}
		}
		
		System.out.println("ends");
	}
	public static void div(int a, int b)	//implicitly thrown to calling statement
	{	
		System.out.println(a/b);
		
	}

}
