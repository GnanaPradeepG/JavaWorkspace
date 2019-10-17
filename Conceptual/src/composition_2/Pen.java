package composition_2;

class Pen 
{
	String color;
	String test;
	public Pen(String color)
	{
		this.color = color;
	}
	public void write()
	{
		System.out.println("write the book in "+ this.color);
	}
}
