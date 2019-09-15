package strings;

import java.util.Scanner;

public class String2 
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
			if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' ||ch == 'u' )
			{
				count++;
			}
		}
		System.out.println("Total no. of vowels present in a string is : " + count);
	}

}
