package watches;

public class Showroom {

	public static void main(String[] args) {
		
		Watch w1 = new Watch(12,34,56);
		Watch w2 = new Watch(23,12,34);
		Watch w3 = new Watch(12,34,56);
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w1.equals(w2));
		System.out.println(w1.equals(w3)); 
	}

}
