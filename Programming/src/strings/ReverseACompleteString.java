
//WAP to reverse a string in below manner

//	input: "html java sql jdbc"
//	output:	"lmth avaj lqs cbdj"

package strings;
import java.util.Scanner;
public class ReverseACompleteString 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = scan.nextLine();
		
		String[] s2 = s1.split(" ");
		
		for (int i = 0; i < s2.length; i++) 
		{
			String temp = s2[i];
			char[] ch = temp.toCharArray();
			for (int k = ch.length-1 ; k >= 0 ; k--) 
			{
				System.out.print(ch[k]);	
			}
				
			System.out.print(" ");
		}
	}

}
