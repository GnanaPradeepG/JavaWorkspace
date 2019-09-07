package mock;

public class Tri implements Shape
{
	int h;
	int b;
	
	public Tri(int h, int b) {
		super();
		this.h = h;
		this.b = b;
	}
	
	@Override
	public void getArea() 
	{
		double area = this.h*this.b*0.5;
		System.out.println(area);
	}
	
}
