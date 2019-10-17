package specialisationAndGeneralisation;

public class Drawingspl {

	public static void main(String[] args) 
	{
		printArea(new CircleArea (7));
		printArea(new Tri(8,9));
	}
	public static void printArea(CircleArea c1)
	{
		c1.getArea();
	}
	public static void printArea(Tri t1) 
	{
		t1.getArea();
	}

}
