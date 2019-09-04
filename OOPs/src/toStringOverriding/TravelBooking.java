package toStringOverriding;

public class TravelBooking 
{
	public static void main(String[] args)
	{
		Bus b1 = new Bus("JBT","KPHB","Palamaner","AP03 TH 4567", 9.8);
		Bus b2 = new Bus("VRCR","JNTU","B'lore","AP12 UH 5678", 7.4);
		Bus b3 = new Bus("SRS", "KPHB", "CHENNAI", "TN14 NA 8672", 7.4);
		System.out.println(b1);
		System.out.println(b2);
		
		boolean status = b1.equals(b2);
		System.out.println(status);
		System.out.println(b2.equals(b3));
	}
}
