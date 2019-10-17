package multiThreading;

public class Sample2 implements Runnable 
{
	@Override
	public void run() 
	{
	this.walk();
	}
	
	public void walk() 
	{
		System.out.println("Inside walk...");
	}
}
