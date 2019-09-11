/*

2
4 8
16 32 64
128 256 512 1024


*/
package pattern$50;
class Pattern7 
{
	public static void main(String[] args) 
	{
		int number=2;
		int length=0;
		for (int i=1;i<=4 ;i++ )
		{
			length++;
			for (int j=1;j<=length ;j++ )
			{
				System.out.print(number+" ");
				number=number*2;
			}
			System.out.println();
		}
	}
}
