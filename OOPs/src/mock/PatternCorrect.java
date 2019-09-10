package mock;

public class PatternCorrect
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=20;j++)
			{
				if(j%2==0)
				{ 
					System.out.print(i+" ");
				}
				else
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
			
		}
	}

}
