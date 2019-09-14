//WAP to find least number 
package arrays;

import java.util.Scanner;

public class Array11 
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
		
		//int com = 2147483647;	max number of integer
		int temp = a[0];
		for (int i = 0; i < a.length; i++) 
		{
			
			if(temp>a[i] )
			{
				temp = a[i];
			}
		}
		System.out.println(temp);

	}
}


