package strings;
import java.util.Scanner;
public class IntegerPalindrome
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to check palindrome : ");
		int num = scan.nextInt();
		int temp = num;
		int rem;
		int out = 0;
		while(num!=0)
		{
		rem= num%10;
		out= out*10+rem;
		num=num/10;		
		}
		
		if(temp==out)
		{
			System.out.println("The given value "+temp + " is a palindrome");
		}
		else
		{
			System.out.println("The given value "+temp + " is not a palindrome");
		}
	}

}
