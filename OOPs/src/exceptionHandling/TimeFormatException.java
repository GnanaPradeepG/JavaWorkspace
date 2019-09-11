package exceptionHandling;

public class TimeFormatException extends RuntimeException 
{
	String a;
@Override
public String toString() 
{
	return "Time format invalid please provide in format of HH:MM:SS with HH[0-23] MM[0-59] SS[0-59]";
}
	
}
