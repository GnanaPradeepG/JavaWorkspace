
//WAP to add all the digits in a given String

package strings;

import java.util.Scanner;

public class DigitsSumInString 
{

	public static void main(String[] args) 
	{
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your string : ");
		String s = scan.nextLine();
		int add =0;
		for (int i = 0; i <= s.length()-1 ; i++) 
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch)==true)
			{
				int k = Integer.parseInt(ch+"");
				add = add + k;
			}
		}
		
		System.out.println("The sum of numbers in given String is : " + add);
		
	}

}
