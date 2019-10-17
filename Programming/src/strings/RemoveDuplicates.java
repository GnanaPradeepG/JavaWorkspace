
//WAP to remove all the duplicate values in a String

package strings;

import java.util.Scanner;

public class RemoveDuplicates 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your string : ");
		String s = scan.nextLine();
		int count=0;
		int index = -1;
		for (int i = 0; i < s.length(); i++)
		{
			count = 0;
			char ch = s.charAt(i);
			while(true)
			{
				index = s.indexOf(ch , index+1);
				if(index==-1)
				{
					break;
				}
				count++;
				System.out.println(count +""+ch);
				
			}
			
			if(count>1)
			{
				System.out.println(ch);
				break;
			}
				
		}
		
		
	}
	


}
