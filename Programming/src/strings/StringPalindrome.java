package strings;

import java.util.Scanner;

public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = scan.next();
		
		String temp = s;
		
		char[] ch = temp.toCharArray();
		
		String check = "";
		  
		for(int i= ch.length-1 ; i>= 0 ;i--)
		{
			check = check + ch[i];
		}

		if(s.equals(check))
		{
			System.out.println("The given String is a palindrome");
		}
		else
		{
			System.out.println("The given String is not a palindrome");
		}
	}

}

