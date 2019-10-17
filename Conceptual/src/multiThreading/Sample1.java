package multiThreading;

public class Sample1 implements Runnable
{
	@Override
	public void run()
	{
		this.move();
	}
	
	public void move()
	{
		System.out.println("Inside move...");
	}
}
