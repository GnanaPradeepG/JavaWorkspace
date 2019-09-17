//WAP to print sum of numbers in a given string
// i/p :- html9sql2jdbc4java5

package strings;

import java.util.Scanner;

public class DigitsInStrings2 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your string : ");
		String s = scan.nextLine();
		String s2 = "";
		for (int i = 0; i <= s.length()-1 ; i++) 
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch)==true)
			{
				s2 = s2+ch;
			}
		}
		
		String[] s3 = new String[s2.length()];
		for (int i = 0; i < s2.length(); i++)
		{
			s3[i] = "" + s2.charAt(i);
		}
		int add = 0;
		for (int i = 0; i < s3.length; i++) 
		{
			add =add + Integer.parseInt(s3[i]);
		}
		
		System.out.println("The sum of numbers in given String is : " + add);
	}

}
