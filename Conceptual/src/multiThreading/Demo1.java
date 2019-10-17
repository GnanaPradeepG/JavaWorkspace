package multiThreading;

public class Demo1 extends  Thread 
{
	@Override
	public void run()
	{
		this.move();
	}
	public void move() 
	{
		System.out.println("Inside move method...");
	}
}
