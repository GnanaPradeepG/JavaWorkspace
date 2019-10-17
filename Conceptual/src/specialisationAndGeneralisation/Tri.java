package specialisationAndGeneralisation;

public class Tri extends Shape{
	int l;
	int b;
	
	public Tri(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}
	@Override
	public void getArea()
	{
		double area = 0.5 *this.l  * this.b;
		System.out.println(area);
	}
	

}
