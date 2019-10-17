package multiThreading;

public class MultiThreading1 
{

	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo1();
		d1.start();	//new stack is created when we call start() method
		Demo2 d2 = new Demo2();
		d2.start();
	}

}
