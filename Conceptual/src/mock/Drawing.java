package mock;

public class Drawing {

	public static void main(String[] args) 
	{
		print(new Circle(5));
		print(new Rect(4,7));
		print(new Tri(5,9));
	}
	
	public static void print(Shape s1) 
	{
		s1.getArea();
	}

}
