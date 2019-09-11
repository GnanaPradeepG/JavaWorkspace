/*
10 10 10 10 10
8 8 8 8
6 6 6
4 4
2
*/
package pattern$50;

class Pattern6 
{
	public static void main(String[] args) 
	{
		int length=6;
		int value=12;
		for (int i=1;i<=5 ;i++ )
		{
			length--;
			value-=2;
			for (int j=1;j<=length ;j++)
			{
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
}
