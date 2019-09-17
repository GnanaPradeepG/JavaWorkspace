//wap to print the indexes of a given character

package strings;
import java.util.Scanner;
public class IndexOfMethod {
	

	public static void main(String[] args) 
	{
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the string : ");
		 String s = scan.next();
		 System.out.print("Enter the character : ");
		 String s2 = scan.next();
		 char ch = s2.charAt(0);
		 int index = -1;
		 
		 while(true)
		 {
			 index = s.indexOf(ch, index + 1);
			 if(index ==-1)
			 {
				 break;
			 }
			 System.out.println(index);
		 }
		 
	}

}
