//WAP to create string array read size during runtime and read string data(fruit names) during runtime 
//and print fruit names which are in even index number 

package arrays;
import java.util.Scanner;
public class Array5 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of fruits you want to enter");
		int size = scan.nextInt();
		System.out.println("You have to enter totally "+size+" fruit names");
		String[] s = new String[size];
		
		for(int i=0; i<=(s.length-1) ;i++)
		{
			System.out.println("Enter the fruit name : ");
			s[i] = scan.next();
		}
		
		System.out.println("The fruit names are : ");
		
		for(int i=0; i<=s.length-1 ; i++)
		{
			if(i%2==0)
			{
				System.out.println(s[i]);
			}
			
		}
	}
}
