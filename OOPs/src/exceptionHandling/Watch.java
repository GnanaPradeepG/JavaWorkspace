package exceptionHandling;

public class Watch
{
	private int hour;
	private int min;
	private int sec;
	
	public Watch(int hour, int min, int sec) 
	{
		if( (hour>=0 && hour<=23) && (min>=0 && min<=59) && (sec>=0 && sec<=59) )
		{	
			this.hour = hour;
			this.min = min;
			this.sec = sec;
		}
		else
		{
			throw new TimeFormatException("Time format invalid please provide in format of HH:MM:SS with HH[0-23] MM[0-59] SS[0-59]");
		}
	}
	public void display() 
	{
			System.out.println("Time is "+hour+":"+min+":"+sec);
	}
	
	
	
	
	
}
