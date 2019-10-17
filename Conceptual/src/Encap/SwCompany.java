package Encap;

public class SwCompany
{

	public static void main(String[] args) 
	{
		Employ e1 = new Employ(456, "Arcus", 4);
		e1.display();
		e1.setId(866);
		e1.setName("pradeep");
		e1.setExp(6);
		System.out.println("============");
		e1.display();
		
	}

}
