//WAP to create a double array and copy data from that array to another array
package arrays;
import java.util.Scanner;
public class Array7
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array you want : ");
		int size = scan.nextInt();
		double[] d = new double[size];
		System.out.println("You have to enter a total of " + size + " values" );
		
		for(int i=0 ; i<= d.length-1 ; i++)
		{
			System.out.println("Enter the values");
			d[i] = scan.nextDouble();
		}
		
		System.out.println("d values are :");
		
		for(int i=0 ; i<=d.length-1 ; i++)
		{
			System.out.println(d[i]);
		}
		
		double[] f = new double[size];
		
		System.out.println("f values before copy...");
		
		for(int i=0 ; i<=d.length-1 ; i++)
		{
			System.out.println(f[i]);
		}
		
		
		for(int i=0 ;i<= d.length-1 ; i++)
		{
			f[i] = d[i];
		}
		
		System.out.println("f values  after copy");
		
		for(int i=0 ;i<= d.length-1 ; i++)
		{
			System.out.println(f[i]);
		}
	}

}
