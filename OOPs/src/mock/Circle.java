package mock;

public class Circle implements Shape
{
	final static double pi = 3.14;
	int r;
	
	public Circle(int r) {
		super();
		this.r = r;
	}
	
	@Override
	public void getArea()
	{
		double area = pi*this.r*this.r;
		System.out.println(area);
	}
	
}
