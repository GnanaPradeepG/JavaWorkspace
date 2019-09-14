package arrays;

import java.util.Scanner;

public class Array13 
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
		
		for(int i=1 ; i<=100 ; i++)
		{
			boolean s = false ;
			for (int j = 0; j < a.length; j++)
			{
				if(a[j]==i)
				{
					s = true;
					break;
				}
			}
			if(s==false)
			{
				System.out.println(i);
			}
		}

	}

}
