// WAP to create two integer arrays transfer  data from first and second array to 3rd array 
//print 3rd array
package arrays;
import java.util.Iterator;
import java.util.Scanner;;
public class Array8
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of first integer array :");
		int size1 = scan.nextInt();
		int[] s1 = new int[size1];
		System.out.println("You have to enter a total of "+ size1 + " values");
		
		for (int i = 0; i <= s1.length-1; i++)
		{
			System.out.print("Enter the value : ");
			s1[i] = scan.nextInt();
		}
		
		System.out.print("Enter the size of Second integer array : ");
		int size2 = scan.nextInt();
		int[] s2 = new int[size2];
		System.out.println("You have to enter a total of "+ size1 + " values");
		
		for (int i = 0; i <= s2.length-1; i++)
		{
			System.out.println("Enter the value : ");
			s2[i] = scan.nextInt();
		}
		
		int[] s3 = new int[size1+size2];
		
		System.out.println("3rd array before copy");
		
		for (int i = 0; i <= s3.length-1; i++) 
		{
			System.out.println(s3[i]);
		}
		for (int i = 0; i <= s3.length-1; i++) 
		{
			if(i<=s1.length-1)
			{
				s3[i] = s1[i];
			}	
			else
			{
				s3[i] = s2[i-(s1.length)];
			}
		}
		
		System.out.println("The copied data of 3rd array is ");
		for (int i = 0; i <= s3.length-1; i++)
		{
			System.out.println(s3[i]);
		}
				

	}

}
