package serialisationAndDeSer;

import java.io.Serializable;

public class Student implements Serializable
{
	int id ;
	String name;
	double marks;
	
	public Student(int id, String name, double marks) 
	{
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public void display() 
	{
		System.out.println("Student's name is "+this.name +" of id number "+this.id+" obtained "+this.marks+" marks");
	}	
}
