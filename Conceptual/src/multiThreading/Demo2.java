package multiThreading;

public class Demo2 extends  Thread
{
	@Override
	public void run() 
	{
		this.walk();
	}
	
	public void walk()
	{
		System.out.println("Inside walk ...");
	}
	
}
