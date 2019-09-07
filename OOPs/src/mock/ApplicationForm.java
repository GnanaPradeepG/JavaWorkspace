package mock;

public class ApplicationForm
{
	private String name;
	private String mobileNo;
	private String address;
	
	public ApplicationForm(String name, String mobileNo, String address) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.address = address;
	}
	
	public void display() 
	{
		System.out.println("name : "+this.name);
		System.out.println("mobileNo is : "+this.mobileNo);
		System.out.println("address : "+ this.address);
	}
	
	
}
