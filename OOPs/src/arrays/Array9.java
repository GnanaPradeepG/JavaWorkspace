//WAP to add all numbers in an array
package arrays;
import java.util.Scanner;
public class Array9 
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
		
		int add = 0;
		
		for (int i = 0; i < a.length; i++)
		{
			add = add + a[i];
		}
		System.out.println(add);
		
	}

}
