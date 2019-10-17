package exceptionHandling;
import java.util.Scanner;
public class Showroom 
{
	

	public static void main(String[] args) 
	{
		System.out.println("Specify time in HH:MM:SS");
		Scanner scan = new Scanner(System.in);
		System.out.println("specify the hours in range of [0-23]");
		int a = scan.nextInt();
		System.out.println("Specify the minutes in range of [0-59]");
		int b = scan.nextInt();
		System.out.println("Specify the seconds in range of [0-59]");
		int c = scan.nextInt();


		while(true)
		{
			try
			{
				Watch rv = new Watch(a,b,c);
				System.out.println(rv);
				break;
			}
			catch(TimeFormatException r)
			{
				System.out.println("==========Error in the time format===========");
				if(a<0 || a>23)
				{
					System.out.println("specify the hours in range of [0-23]");
					a = scan.nextInt();
				}
	
				if(b<0 || b>59)
				{
					System.out.println("Specify the minutes in range of [0-59]");
					b =scan.nextInt();
				}
				
				if(c<0 || c>59)
				{
					System.out.println("Specify the seconds in in range of [0-59]");
					c = scan.nextInt();
				}
			}
			finally
			{
				System.out.println("test");
			}
		}
	}
}
