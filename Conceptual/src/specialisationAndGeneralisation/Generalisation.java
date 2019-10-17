package specialisationAndGeneralisation;

public class Generalisation {
	public static void main(String[] args) {
		printArea(new CircleArea(123));
		printArea(new Tri(32,43));
	}

	public static void printArea(Shape s)
	{
		s.getArea();
	}
}
