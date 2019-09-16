//WAP to do BUBBLE SORTING in an array

package arraySorting;
import java.util.Scanner;
public class BubbleSorting 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("You have to enter a total of "+ size + " values");
		
		for(int  i = 0 ; i<a.length ; i++)
		{
			System.out.print("Enter the value:");
			a[i] = scan.nextInt();	
		}
		int temp;
		for (int cycle = 0; cycle <= a.length-1; cycle++)
		{
			for (int i = 0; i <= a.length-2; i++)
			{
				if(a[i] > a[i+1])
				{
					temp = a[i];
					a[i] = a[i+1];	//swap program
					a[i+1] = temp;
				}
				
			}
			
			//=============DEBUGGING====================
			
//			System.out.println("array after this sorting cycle (ONLY FOR DEBUGGING) ");
//			for (int j = 0; j <= a.length-1; j++)
//			{
//				System.out.println(a[j]);
//			}
		}
		
		System.out.println("Final output");
		for (int i = 0; i <= a.length-1; i++)
		{
			System.out.println(a[i]);
		}
	}

}