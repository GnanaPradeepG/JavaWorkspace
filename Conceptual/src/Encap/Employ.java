package Encap;

public class Employ 
{
	
	private int id;
	private String name;
	private int exp;
	
	public Employ(int id, String name, int exp) 
	{
		this.exp = exp;
		this.id =id;
		this.name = name;
	}
	
	public void display() 
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.exp);
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public  void setId(int id)
	{
		this.id = id;
	}

	public String getName() 
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getExp()
	{
		return this.exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
}
