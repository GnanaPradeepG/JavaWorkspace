
//WAP to create TreeSet , which holds double object retrive first 3 objects and remove 4th object and continue retrival

package collections;
import java.util.*;
public class TreeSet3 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		TreeSet t = new TreeSet();
		String check = "y";
		int value = 1;
		double d = 0;
		for (int i = 0; i < value; i++)
		{
			System.out.print("Enter the double value : ");
			d = scan.nextDouble();
			t.add(new Double(d));
			System.out.println("do you want one more value?? press y if yes");
			String s = scan.next();
			if(s.equals(check))
			{
				value++;
			}
			else
			{
				System.out.println("your collection is created...");
			}
		}

		Iterator i = t.iterator();
		int count = 0;
		while(i.hasNext())
		{
			count++;
			Object o = i.next();
			Double d1 = (Double) o;
			if(count%4 !=0)
			{
				System.out.println(d1);
			}
		}
	}
}
