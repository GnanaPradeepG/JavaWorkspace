/*

9 8 7
6 5 4
3 2 1

*/
package pattern$50;
class  Pattern5
{
	public static void main(String[] args) 
	{
		int value=10;
		for (int i=1;i<=3 ;i++ )
		{
			for (int j=1;j<=3 ;j++ )
			{
				value--;
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
}
