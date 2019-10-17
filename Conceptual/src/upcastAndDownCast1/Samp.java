package upcastAndDownCast1;

public class Samp {

	public static void main(String[] args) {
		Test1 b = new Test2();
		b.run();
		Test2 c= (Test2) b;
		c.run();
		c.run2();
	}

}
