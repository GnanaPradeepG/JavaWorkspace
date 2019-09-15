
//WAP to reverse a String

package strings;
import java.util.Scanner;
public class ReverseAString 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s1 = scan.next();
		String s2 = "";	//null or empty string
		for (int i = s1.length()-1; i >= 0; i--)
		{
			
			s2	= s2 + s1.charAt(i);
		}
		
		System.out.println(s2);
	}

}
