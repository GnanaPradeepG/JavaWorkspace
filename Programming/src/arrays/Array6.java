//WAP to create integer array and print data in reverse order
package arrays;
import java.util.Scanner;
public class Array6 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of interger array you want : " );
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("you have to provide "+ size +" values"  );
		
		for(int i=0; i<=a.length-1 ; i++)
		{
			System.out.println("Enter the values:");
			a[i] = scan.nextInt();
		}
		
		for(int i=a.length-1 ; i>=0  ; i--)
		{
			System.out.println(a[i]);
		}
		
	}

}
