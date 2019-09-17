package strings;

import java.util.Scanner;

public class DigitInString 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your string : ");
		String s = scan.nextLine();
		int count=0; 
		for (int i = 0; i <= s.length()-1 ; i++) 
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch)==true)
			{
				count++;
			}
		}
		System.out.println("The total no. of digits are : "+count);
	}

}
