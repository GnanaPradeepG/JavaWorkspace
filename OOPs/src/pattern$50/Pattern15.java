package pattern$50;

public class Pattern15 
{

	public static void main(String[] args) 
	{
		int space = 5;
		char ch = 'F';
		int ms = -2;
		char ch2 = 'E';
		
		for(int i=1; i<=9 ; i++)
		{
			
			if(i<=5)
			{
				space--;
				ch--;
				ms+=2;
			}
			else
			{
				space++;
				ch++;
				ms-=2;
			}
			for(int j=0;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			System.out.print(ch);
			
			for(int k=1;k<=ms;k++)
			{
				System.out.print(" ");
			}
			
			System.out.println(ch);
		}
	}

}
