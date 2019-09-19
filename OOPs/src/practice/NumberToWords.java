package practice;
import java.util.Scanner;
public class NumberToWords 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scan.nextInt();
		numberToWords(number);
		System.out.println(reverse(number));
		System.out.println(getDigitCount(number));
	}

	public static void numberToWords(int number) 
	{

		int rem;
		int quo;
		String s = "";
		if(number>=0)
		{
			while(number!=0)
			{
				rem = number%10;
				number = number/10;
				if(rem == 0)
				{
					s = s + "zero ";
				}

				if(rem == 1)
				{
					s = s + "one ";
				}

				if(rem == 2)
				{
					s = s + "two ";
				}

				if(rem == 3)
				{
					s = s + "three ";
				}

				if(rem == 4)
				{
					s = s + "four ";
				}

				if(rem == 5)
				{
					s = s + "five ";
				}

				if(rem == 6)
				{
					s = s + "six ";
				}

				if(rem == 7)
				{
					s = s + "seven ";
				}

				if(rem == 8)
				{
					s = s + "eight ";
				}

				if(rem == 9)
				{
					s = s + "nine ";
				}
			}
		}
		else
		{
			System.out.print("Invalid Value");
		}

		String[] temp = s.split(" ");
		for (int i = temp.length-1; i >= 0; i--) 
		{
			System.out.print(temp[i] + " ");
		}
		System.out.println();
	}

	public static String reverse(int number) 
	{
		String s = "" + number;
		char[] a =s.toCharArray();
		String temp = "";
		for (int i = 0; i < a.length; i++)
		{
			temp = a[i]+"";
		}
		return temp;
	}

	public static int getDigitCount(int number)
	{
		String s = ""+number;
		return s.length();
	}
}
