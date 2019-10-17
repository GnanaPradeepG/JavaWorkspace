package exceptionHandling;

public class Exp4 
{

	public static void main(String[] args) 
	{
		System.out.println("Starts");
		
		try
		{
			display();
		}
		catch(InterruptedException rv) 
		{
			System.out.println("Exception is caught");
		}
		
		System.out.println("ends");
	}
	
	public static void display() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Hello");
	}

}
