package strings;

import java.util.Scanner;

public class String5 
{
 
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = scan.next();
		//=================================
		System.out.print("Enter the character to check : ");
		String c = scan.next();
		char check = c.charAt(0);	//converting a string to char
		//checking char
		
		boolean status = false;
		for (int i = 0; i < s.length() ; i++) 	
		{
			char ch = s.charAt(i);
			if(check == ch)
			{
				System.out.println("The given char is present in given String.");
				status = true;
				break;
			}
			
		}
		
		
		
		if(status == false)
		{
			System.out.println("The given char is not present in given String.");
		}
		
	}

}
