package specialisationAndGeneralisation;

public class CircleArea extends Shape {
	
	int r;
	final static double pi = 3.14;
	
	

	public CircleArea(int r) {
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
