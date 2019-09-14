/*

5 @ 5 - odd
7 9 @ 16 - even
11 13 15 @ 39 - odd
17 19 21 23 @ 80 - even

*/
package pattern$50;
class Pattern13
{
	public static void main(String[] args) 
	{
		int odd = 3;
		int odd_count=0;
		int sum=0;

		for (int i=1;i<=4 ;i++ )
		{
			odd_count++;
			sum=0;
			for (int j=1;j<=odd_count ;j++ )
			{
				odd+=2;
				System.out.print(odd+" ");
				sum=sum+odd;
			}
			System.out.print('@');
			
			System.out.print(sum);
			System.out.print('-');
			if (sum%2==0)
			{
				System.out.print("even");
			}
			else
			{
				System.out.print("odd");
			}
			System.out.println();
		}
	}
}
