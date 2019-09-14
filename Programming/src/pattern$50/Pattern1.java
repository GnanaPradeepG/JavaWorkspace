/*

123
456
789

*/
package pattern$50;
class  Pattern1
{
	public static void main(String[] args) 
	{
		int value=0;
		for (int i=1;i<=3 ;i++ )
		{
			for (int j=1;j<=3 ;j++ )
			{
				value++;
				System.out.print(value);
			}
			System.out.println();
		}
	}
}