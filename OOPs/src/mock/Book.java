package mock;

public class Book 
{
	//encapsulated the data members
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	
	//generated constructor to pass values
	public Book(String bookName, String bookAuthor, double bookPrice) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		
	}
	
	public void print() 
	{
		System.out.println("author:"+this.bookAuthor);
		System.out.println("name:"+this.bookName);
		System.out.println("price:"+this.bookPrice);
	}
	
	
}
