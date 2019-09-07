package watches;

public class Watch 
{
	private int hour;
	private int min;
	private int sec;
	public Watch(int hour, int min , int sec) 
	{
		if ((hour>=0&&hour<=23) &&(min>=0 && min<=59)&&(sec>=0 && sec<=59))
		{
			this.hour = hour;
			this.min = min;
			this.sec = sec;
		}
		else
		{
			System.out.println("Invalid time format...");
		}
		
	}
	@Override
	public String toString() 
	{
		
		return "Time is "+this.hour+":"+this.min+":"+this.sec;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		Watch w = (Watch) obj;
		return ((this.hour==w.hour)&&(this.min==w.min)&&(this.sec==w.sec));
	}
	
}
