
//WAP to create TreeSet and store colors and retrive one by one

package collections;
import java.util.*;
public class TreeSet1 
{

	public static void main(String[] args) 
	{
		//TreeSet doesnot accept duplicate values it sorts in ascending order
		TreeSet t1 = new TreeSet();			//creating TreeSet object to pass values
		t1.add(new String("Red"));
		
		//from jdk 1.5 boxing is implicit
		
		t1.add("Blue");
		//add() is used to add Objects to TreeSet class			
		
		//TreeSet automatically upcasts to Object class
		
		System.out.println(t1.size());
		
		//TreeSet class by itself cannot retrive the values so we use Iterator for this purpose
		//Iterator is an interface with method next() hasNext() remove()
		//they are overrided in implemented class and abstracted
		//helper class is TreeSet class itself and helper method name is iterator itself
		
		
		Iterator i = t1.iterator();		
		
		// TreeSet class object t1 is used to access this iterator() method (helper method)  
		
		Object o1 = i.next();
		Object o2 =  i.next();//elements are upcasted to Object class [super class for TreeSet] so need to perform Iterator method to object class
		
		String i1 = (String) o1;
		String i2 = (String) o2;//downcasting it to String class
		System.out.println(i1+" "+i2);		//implicit call to toString() in String class(Overriden)
		
	}

}
