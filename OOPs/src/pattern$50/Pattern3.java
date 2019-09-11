/*

1 2 3 4 5 6
7 8 9 10 11
12 13 14 15
16 17 18
19 20
21
*/

package pattern$50;

class Pattern3
{
	public static void main(String[] args) 
	{
		int length=7;
		int value=0;
		for (int i=1;i<=6 ;i++ )
		{
			length--;
			for (int j=1;j<=length ;j++ )
			{
				value++;
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
}
