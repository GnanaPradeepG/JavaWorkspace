//WAP  to count no. of ' e ' present in a  program
package strings;
import java.util.Scanner;
public class String1 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = scan.next();
		int count = 0;
		for (int i = 0; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(ch == 'e')
			{
				count++;
			}
		}
		System.out.println("The total number of 'e'  in string are : " + count);
	}

}
