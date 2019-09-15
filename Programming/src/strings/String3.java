package strings;

import java.util.Scanner;

public class String3 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = scan.next();
		for (int i = 0; i < s.length() ; i++) 	
		{
			int count = 0;
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' ||ch == 'u' )
			{
				System.out.print(ch + " ");
				
			}		
			
		}
	}

}
