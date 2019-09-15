
//WAP to print a String in reverse using an array

package strings;
import java.util.Scanner;
public class ReverseStringUsingArray 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = scan.next();
		char[] c1 = s1.toCharArray();
		
		for (int i = c1.length-1; i >= 0 ; i--)
		{
			System.out.print(c1[i]);
		}
	}

}
