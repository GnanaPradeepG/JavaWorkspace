package exceptionHandling;
import java.util.Scanner;
public class Showroom 
{
	

	public static void main(String[] args) 
	{
		System.out.println("Specify time in HH:MM:SS");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		while(true)
		try
		{
			Watch rv = new Watch(a,b,c);
			rv.display();
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
	}
}
