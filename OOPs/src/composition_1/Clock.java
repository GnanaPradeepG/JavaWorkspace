package composition_1;

public class Clock
{
	private int hour;
	private int min;
	private int sec;
	public Clock (int hour, int min, int sec)
	{
		if((hour >= 0 && hour <= 23) && (min >= 0 && min <=59) && (sec >=0 && sec <= 59))
		{
			this.hour = hour;
			this.min = min;
			this.sec = sec;
		}
		else
		{
			System.out.println("Invalid Time");
		}
	}
	
	public void time() 
	{
		System.out.println(this.hour + ":" + this.min +":" + this.sec);
	}
}
