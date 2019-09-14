package arrays;
import java.util.Scanner;
public class Array3 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("give the size of array");
		int size = scan.nextInt();
		System.out.println("give the values of array... you have to give totally "+size+" datas...");
		int[] a = new int[size];
		
		for(int i = 0;i<=a.length-1;i++ )
		{
			System.out.println("Enter the data : ");
			a[i] =scan.nextInt();
		}
		System.out.println("The values are: ");
		for(int i = 0; i<=a.length-1;i++)
		{
			System.out.print(a[i] + " ");
		}
		
	}

}
