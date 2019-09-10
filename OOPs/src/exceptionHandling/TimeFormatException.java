package exceptionHandling;

public class TimeFormatException extends RuntimeException 
{
	String a;
	public TimeFormatException(String a) 
	{
		super(a);
	}
	
}
