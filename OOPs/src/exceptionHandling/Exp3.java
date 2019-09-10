package exceptionHandling;

public class Exp3 
{

	public static void main(String[] args) 
	{
		System.out.println("Execution starts");
		
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException rv)
		{
			System.out.println("Exception caught");
		}
		
		System.out.println("Execution ends");
	}

}
