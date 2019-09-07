package scannerClass;

//import scanner class

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) 
	{
		//create a scanner class object
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string data");
		String data1 = scan.next();
		System.out.println("Enter integer data");
		int data2 = scan.nextInt();
		System.out.println(data1 +"\n"+ data2);
		//char can't take i/p
		
	}

}