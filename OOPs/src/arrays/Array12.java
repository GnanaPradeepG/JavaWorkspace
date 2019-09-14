//WAP to print common numbers between 2 arrays
package arrays;
import java.util.Scanner;
public class Array12 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of first array : ");
		int size1 = scan.nextInt();
		int[] a = new int[size1];
		System.out.println("You have to enter a total of "+ size1 + " values");
		
		for(int  i =0 ; i<a.length ; i++)
		{
			System.out.print("Enter the value:");
			a[i] = scan.nextInt();
		}
		
		System.out.print("Enter the size of second array : ");
		int size2 = scan.nextInt();
		int[] b = new int[size2];
		System.out.println("You have to enter a total of "+ size2 +" values");
		
		for (int i = 0; i < b.length; i++)
		{
			System.out.println("Enter the values");
			b[i] = scan.nextInt();
		}
		
		
		for (int i = 0; i < a.length; i++)
		{
			int temp = a[i];
			for (int j = 0; j < b.length; j++) 
			{
				if(temp==b[j])
				{
					System.out.println(temp);
				}
			}
		}
	}

}
