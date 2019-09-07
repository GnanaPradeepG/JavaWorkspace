package mock;

public class Rect implements Shape 
{
	int l;
	int b;
	
	public Rect(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}
	
	@Override
	public void getArea() 
	{
		double area = this.l* this.b;
		System.out.println(area);
	}
	

}
