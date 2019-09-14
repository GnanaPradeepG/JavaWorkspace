//WAP to find first highest number of given array
package arrays;
import java.util.Scanner;
public class Array10 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = scan.nextInt();
		System.out.println("Enter the values of array");
		int[] a = new int[size];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter the array value : ");
			a[i] = scan.nextInt();
		}
		
		
		int com = a[0];
		
		for (int i = 0; i < a.length; i++) 
		{
			if(com<a[i])
			{
				com = a[i];
			}
		}
		System.out.println(com);
		
	}

}
