package multiThreading;

public class MultiThreading2 
{

	public static void main(String[] args) 
	{
		Sample1 s1 = new Sample1();
		Sample2 s2 = new Sample2();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		t1.start();
		t2.start();
	}

}
