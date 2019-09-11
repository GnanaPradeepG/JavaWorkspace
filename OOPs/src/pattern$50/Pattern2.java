/*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

package pattern$50;
class  Pattern2
{
	public static void main(String[] args) 
	{
		int length=0;
		int value=0;
		for (int i=1;i<=5;i++ )
		{
			length++;
			for (int j=1;j<=length ;j++ )
			{
				value++;
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
}
