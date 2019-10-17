

//WAP to create TreeSet and store double , integer , String object , character object and retrive one by one

package collections;
import java.util.*;
public class TreeSet2 
{

	
	public static void main(String[] args) 
	{
		TreeSet t1 = new TreeSet();
		
		
		try
		{
			t1.add(45);
			t1.add(78.8);
			t1.add("Test");
			t1.add(true);
		}
		catch(ClassCastException e)
		{
			System.out.println("TreeSet can only store an single type of data");
		}
		
		
	
		Iterator i = t1.iterator();
		 
		while(i.hasNext())
		{

			Object o = i.next();
			 Integer i1 = (Integer) o;
			 System.out.println(i1);
		}
		
		//===========TreeSet can only store an single type of data=============

	}

}
