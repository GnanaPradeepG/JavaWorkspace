
//WAP to print count of each type of vowels present in a given String 

package strings;

import java.util.Scanner;

public class String4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = scan.nextLine();
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		
		for (int i = 0; i < s.length() ; i++) 	
		{
			char ch = s.charAt(i);
				if(ch == 'a')
				{
					countA++;
				}
				
				if(ch == 'e')
				{
					countE++;
				}
				
				if(ch == 'i')
				{
					countI++;
				}
				if(ch == 'o')
				{
					countO++;
				}
				if(ch == 'u')
				{
					countU++;
				}
		} 
		
		if(countA>0)
		{
			System.out.println("no. of a's present in the String are : "+ countA);
		}
		
		if(countE>0)
		{
			System.out.println("no. of e's present in the String are : "+ countA);
		}
		if(countI>0)
		{
			System.out.println("no. of i's present in the String are : "+ countA);
		}
		
		if(countO>0)
		{
			System.out.println("no. of o's present in the String are : "+ countA);
		}
		
		if(countU>0)
		{
			System.out.println("no. of u's present in the String are : "+ countA);
		}
	}

}
